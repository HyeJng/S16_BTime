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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("aladin loading");
		getAladinApi();
		
		out.println("aladin finish");
		response.sendRedirect(request.getContextPath()+"/main");
	}
	
	private void getAladinApi()  {
    	try {
//    		method : "get",
//    		dataType : "jsonp",
//    		url : "http://www.aladin.co.kr/ttb/api/ItemLookUp.aspx",
//    		data : {
//    			//TTBKey : "ttbcmqlfkd_1542001",
//    			//TTBKey : "ttbto66931826001",
//    			TTBKey : "ttbhagalaz04301822001",
//    			ItemId : "9791130689890",
//    			//ItemIdType: "9791130689890",
//    			Cover:"Big",
//    			//OptResult:"ratingInfo",
//    			Output : "JS",
//    			Version: "20131101",
//    			OptResult:"Story,ratingInfo",
//    			callback : "abc"
//    		}
    		// 1.url생성
	        StringBuilder urlBuilder = new StringBuilder("http://www.aladin.co.kr/ttb/api/ItemLookUp.aspx"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("TTBKey","UTF-8") + "=" + "ttbhagalaz04301822001"); /*Service Key*/
	        urlBuilder.append("&" + URLEncoder.encode("ItemId","UTF-8") + "=" + URLEncoder.encode("9791130689890", "UTF-8")); /*페이지번호*/
	        urlBuilder.append("&" + URLEncoder.encode("Cover","UTF-8") + "=" + URLEncoder.encode("Big", "UTF-8")); 
	        urlBuilder.append("&" + URLEncoder.encode("Output","UTF-8") + "=" + URLEncoder.encode("JS", "UTF-8")); 
	        urlBuilder.append("&" + URLEncoder.encode("Version","UTF-8") + "=" + URLEncoder.encode("20131101", "UTF-8")); 
	        urlBuilder.append("&" + URLEncoder.encode("OptResult","UTF-8") + "=" + URLEncoder.encode("Story,ratingInfo", "UTF-8")); 
	        
    		// 2.url로 연결
	        URL url = new URL(urlBuilder.toString());
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json");
	        System.out.println("Response code: " + conn.getResponseCode());
	        
	        // 3.연결 Stream으로 부터 읽기
	        // 방법 1 - stream 으로 부터 읽은 것을 console 출력
	        /*
	        BufferedReader rd;
	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	        }
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = rd.readLine()) != null) {
	            sb.append(line);
	        }
	        System.out.println(sb.toString());
	        rd.close();
	        */
	        
	        // 방법 2 - stream 으로 부터 읽은 것을 class 넣기
	        // conn --> inputstream --> Document --> xml 다룰수 있음
	        Document doc = parseXML(conn.getInputStream());
	        NodeList list = doc.getElementsByTagName("item");
	        System.out.println(list.getLength());
	        System.out.println(list.item(0));
	        
	        List<BookVo> volist = new ArrayList<BookVo>();
	        for(int i=0; i<list.getLength(); i++) {
	        	
	        	// list.item(i)의 결과를 변수명 item에 대입해주세요.
	        	Node item = list.item(i);
	        	// NullPointException 은 . 앞이 null 이어서 오류발생
	        	Node n = item.getFirstChild();  // deathCnt
	        	
	        	BookVo vo = new BookVo();	        	
        		while(n != null) {
	        		String nodeName = n.getNodeName();
	        		String nodeText = n.getTextContent();
	        		try {
//		        		switch(nodeName) {
//		        		case "deathCnt":
//		        			vo.setDeathCnt(Long.parseLong(nodeText));
//		        			break;
//		        		case "defCnt":
//		        			vo.setDefCnt(Long.parseLong(nodeText));
//		        			break;
//		        		case "gubun":
//		        			vo.setGubun(nodeText);
//		        			break;
//		        		case "gubunCn":
//		        			vo.setGubunCn(nodeText);
//		        			break;
//		        		case "gubunEn":
//		        			vo.setGubunEn(nodeText);
//		        			break;
//		        		case "incDec":
//		        			vo.setIncDec(Long.parseLong(nodeText));
//		        			break;
//		        		case "isolClearCnt":
//		        			vo.setIsolClearCnt(Long.parseLong(nodeText));
//		        			break;
//		        		case "isolIngCnt":
//		        			vo.setIsolIngCnt(Long.parseLong(nodeText));
//		        			break;
//		        		case "localOccCnt":
//		        			vo.setGubunEn(nodeText);
//		        			break;
//		        		case "overFlowCnt":
//		        			vo.setOverFlowCnt(Long.parseLong(nodeText));
//		        			break;
//		        		case "qurRate":
//		        			vo.setQurRate(Long.parseLong(nodeText));
//		        			break;
//		        		case "stdDay":
//		        			vo.setStdDay(nodeText);
//		        			break;
//		        		}
	        		}catch (Exception e) {
						e.printStackTrace();
					}
	        		n = n.getNextSibling();
	        	}
	        	
		        volist.add(vo);
	        }
	        
	        
	        for(BookVo vo : volist) {
	        	
	        	System.out.println(vo);
	        }
	        
	        

	        conn.disconnect();
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }  // 메소드 닫힘 f2

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
		} catch (SAXException e) {  // Simple API for XML
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
    	
    	
    	//System.arraycopy(src, srcPos, dest, destPos, length);
    	int[] arr =new int[5];
    	int[] arr5 = new int[arr.length];
    	arr5 = arr.clone();
//    	int[] arr5 = Arrays.copyOf(original, newLength);
    	
    	return result;
    }
}
