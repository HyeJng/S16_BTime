package kh.semi.s16.bt.controller.book;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import kh.semi.s16.bt.model.service.BookService;
import kh.semi.s16.bt.model.vo.BookVo;

/**
 * Servlet implementation class BookInsertController
 */
@WebServlet("/bookinsertFromAladin")
public class BookInsertFromAladinAPIController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookInsertFromAladinAPIController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("aladin loading");
		getAladinApi();

		out.println("aladin finish");
//		response.sendRedirect(request.getContextPath()+"/main");
		out.flush();
		out.close();
	}

	private void getAladinApi() {
		try {
			// 책 한 권
//    		method : "get",
//    		dataType : "jsonp",
//    		url : "http://www.aladin.co.kr/ttb/api/ItemLookUp.aspx",
//    		data : {
//    			TTBKey : "TTBKey작성",
//    			ItemId : "9791130689890",
//    			//ItemIdType: "9791130689890",
//    			Cover:"Big",
//    			//OptResult:"ratingInfo",
//    			Output : "JS",
//    			Version: "20131101",
//    			OptResult:"Story,ratingInfo",
//    			callback : "abc"
//    		}

		// 베스트셀러 목록
//    		method : "get",
//    		dataType : "jsonp",
//    		url : "http://www.aladin.co.kr/ttb/api/ItemList.aspx",
//    		data : {
//    			TTBKey : "TTBKey작성",
//    			QueryType : "Bestseller",
//    			SearchTarget:"Book",
//    			output : "JS",
//    			start : "1",
//    			cover: "big",
//    			Version: "20131101",
//    			callback : "abc"
//    		}
			// 1.url생성

			StringBuilder urlBuilder = new StringBuilder("http://www.aladin.co.kr/ttb/api/ItemList.aspx"); /* URL */
			urlBuilder.append(
					"?" + URLEncoder.encode("TTBKey", "UTF-8") + "=" + "ttbhagalaz04301822001"); /* Service Key */
			urlBuilder.append("&" + URLEncoder.encode("QueryType", "UTF-8") + "="
					+ URLEncoder.encode("BlogBest", "UTF-8")); /* 페이지번호 */
			urlBuilder.append("&" + URLEncoder.encode("Cover", "UTF-8") + "=" + URLEncoder.encode("Big", "UTF-8"));
			urlBuilder.append(
					"&" + URLEncoder.encode("SearchTarget", "UTF-8") + "=" + URLEncoder.encode("Book", "UTF-8"));
			urlBuilder.append("&" + URLEncoder.encode("MaxResults", "UTF-8") + "=" + URLEncoder.encode("50", "UTF-8"));
			urlBuilder.append("&" + URLEncoder.encode("Output", "UTF-8") + "=" + URLEncoder.encode("XML", "UTF-8")); // xml
																														// 형태
			urlBuilder.append("&" + URLEncoder.encode("start", "UTF-8") + "=" + URLEncoder.encode("2", "UTF-8"));
			urlBuilder
					.append("&" + URLEncoder.encode("Version", "UTF-8") + "=" + URLEncoder.encode("20131101", "UTF-8"));

			// 2.url로 연결
			URL url = new URL(urlBuilder.toString());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			System.out.println("Response code: " + conn.getResponseCode());

			// 3.연결 Stream으로 부터 읽기
			// 방법 1 - stream 으로 부터 읽은 것을 console 출력
			/*
			 * BufferedReader rd; if(conn.getResponseCode() >= 200 && conn.getResponseCode()
			 * <= 300) { rd = new BufferedReader(new
			 * InputStreamReader(conn.getInputStream())); } else { rd = new
			 * BufferedReader(new InputStreamReader(conn.getErrorStream())); } StringBuilder
			 * sb = new StringBuilder(); String line; while ((line = rd.readLine()) != null)
			 * { sb.append(line); } System.out.println(sb.toString()); rd.close();
			 */

			// 방법 2 - stream 으로 부터 읽은 것을 class 넣기
			// conn --> inputstream --> Document --> xml 다룰수 있음
			Document doc = parseXML(conn.getInputStream());
			NodeList list = doc.getElementsByTagName("item");
			System.out.println(list.getLength());
			System.out.println(list.item(0));

			List<BookVo> volist = new ArrayList<BookVo>();
			for (int i = 0; i < list.getLength(); i++) {

//				list.item(i)의 결과를 변수명 item에 대입
				Node item = list.item(i);
				// NullPointException 은 . 앞이 null 이어서 오류발생
				Node n = item.getFirstChild(); // deathCnt

				BookVo vo = new BookVo();
				while (n != null) {
					String nodeName = n.getNodeName();
					String nodeText = n.getTextContent();
					try {
						switch (nodeName) {
						case "isbn13": // case "itemId":
							vo.setIsbn(nodeText);
							break;
						case "cover":
							vo.setThum_img(nodeText);
							break;
						case "title":
							vo.setBook_name(nodeText);
							break;
						case "author":
							vo.setAuthor(nodeText);
							break;
						case "publisher":
							vo.setPublisher(nodeText);
							break;
						case "categoryName":
							vo.setCategory(nodeText);
							break;
						case "description":
							vo.setBook_intro(nodeText);
							break;
						case "a":
							vo.setAuth_intro(nodeText);
							break;
						case "b":
							vo.setPub_intro(nodeText);
							break;
						case "ratingCount":
							vo.setGrade_peo(Integer.parseInt(nodeText));
							break;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					n = n.getNextSibling();
				}
				
				volist.add(vo);
			}

			for (BookVo vo : volist) {
				System.out.println(vo);
			}

			conn.disconnect();

			BookService service = new BookService();
			service.insert(volist);

		} catch (IOException e) {
			e.printStackTrace();
		}
	} // 메소드 닫힘

	// 기본자세 - 메소드정의 - 첫번째 return type 확인 void 아니면 return
	// InputStream 형태의 객체를 Document 바꿔줌
	private Document parseXML(InputStream stream) {
		Document result = null;
		DocumentBuilderFactory abc = null;
		DocumentBuilder builder = null;
		try {
			abc = DocumentBuilderFactory.newInstance();
			builder = abc.newDocumentBuilder();
			result = builder.parse(stream);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) { // Simple API for XML
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// System.arraycopy(src, srcPos, dest, destPos, length);
		int[] arr = new int[5];
		int[] arr5 = new int[arr.length];
		arr5 = arr.clone();
//    	int[] arr5 = Arrays.copyOf(original, newLength);

		return result;
	}
}
