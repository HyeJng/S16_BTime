<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <div id="event">
            <div class="e_link">
                <a href="#"><p>지금 가입하고 인기상품 <strong>100원</strong>에 받아가세요!</p></a>
                <button id="event_btn" type="button"><img src="https://res.kurly.com/pc/ico/1908/ico_close_fff_84x84.png" alt="e_close"></button>
            </div>
        </div>
        <div id="header">
            <div class="h_first">
                <div class="h_f_1">
                    <div>
                    <c:choose>
                    	<c:when test="${empty loginSsInfo}">
	                    	 <a href="${pageContext.request.contextPath }/join">회원가입</a>
	                        <div>|</div>
	                        <a href="${pageContext.request.contextPath }/login">로그인</a>
	                        <div>|</div>
                    	</c:when>
                    	<c:otherwise>
                    		${ loginSsInfo.mname}
	                        <div>|</div>
	                        <a href="${pageContext.request.contextPath }/logout">로그아웃</a>
	                        <div>|</div>
                    	</c:otherwise>
                    </c:choose>
                       
                        <div>
                            <a href="${pageContext.request.contextPath }/notice.html">고객센터
                                <img src="https://res.kurly.com/pc/ico/1908/ico_down_16x10.png">
                            </a>
                            <div class="h_f_1_a3_hover" onclick="location.href='${pageContext.request.contextPath }/notice.html';">
                                <div>공지사항</div>
                                <div>자주하는 질문</div>
                                <div>1:1 문의</div>
                                <div>대량주문 문의</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="h_f_2">
                    <div id="main_logo" onclick="location.href='${pageContext.request.contextPath }/main';">
                        <img src="./images/마켓컬리로고.svg" alt="main_logo">
                        <button type="button">마켓컬리</button>
                    </div>
                    <div id="search">
                        <input type="text" placeholder="검색어를 입력해주세요.">
                        <button type="button"><img src="./images/search_logo.svg"></button>
                    </div>
                    <div id="buttons">
                        <button type="button"></button>
                        <button type="button"></button>
                        <button type="button" onclick="location.href='${pageContext.request.contextPath }/shopping_basket_guest.html';"></button>
                        <div class="buttons_first_hover">
                            <img src="data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHN2ZyB3aWR0aD0iMThweCIgaGVpZ2h0PSIxMXB4IiB2aWV3Qm94PSIwIDAgMTggMTEiIHZlcnNpb249IjEuMSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxuczp4bGluaz0iaHR0cDovL3d3dy53My5vcmcvMTk5OS94bGluayI+CiAgICA8dGl0bGU+ZHJvcGRvd25fdGFpbDwvdGl0bGU+CiAgICA8ZyBpZD0i67ew7Yuw7Lus66asLVBoYXNlLTEiIHN0cm9rZT0ibm9uZSIgc3Ryb2tlLXdpZHRoPSIxIiBmaWxsPSJub25lIiBmaWxsLXJ1bGU9ImV2ZW5vZGQiPgogICAgICAgIDxnIGlkPSJQQ19Ib21lX01hcmtldF/sp4TsnoXsi5wiIHRyYW5zZm9ybT0idHJhbnNsYXRlKC0xMTExLjAwMDAwMCwgLTEzMi4wMDAwMDApIj4KICAgICAgICAgICAgPGcgaWQ9ImRyb3Bkb3duX2JveCIgdHJhbnNmb3JtPSJ0cmFuc2xhdGUoOTc4LjAwMDAwMCwgMTMyLjAwMDAwMCkiPgogICAgICAgICAgICAgICAgPGcgaWQ9ImRyb3Bkb3duX3RhaWwiIHRyYW5zZm9ybT0idHJhbnNsYXRlKDEzMy4wMDAwMDAsIDAuMDAwMDAwKSI+CiAgICAgICAgICAgICAgICAgICAgPHJlY3QgaWQ9IlJlY3RhbmdsZSIgZmlsbD0iI0ZGRkZGRiIgeD0iMCIgeT0iMCIgd2lkdGg9IjE4IiBoZWlnaHQ9IjExIj48L3JlY3Q+CiAgICAgICAgICAgICAgICAgICAgPHJlY3QgaWQ9IlJlY3RhbmdsZSIgZmlsbD0iI0RERERERCIgeD0iMCIgeT0iMTAiIHdpZHRoPSIxOCIgaGVpZ2h0PSIxIj48L3JlY3Q+CiAgICAgICAgICAgICAgICAgICAgPHBhdGggZD0iTTksMCBMMTcuMjUsMTEgTDAuNzUsMTEgTDksMCBaIiBpZD0iQ29tYmluZWQtU2hhcGUiIGZpbGw9IiNEREREREQiPjwvcGF0aD4KICAgICAgICAgICAgICAgICAgICA8cGF0aCBkPSJNOSwxLjY1IEwxNi4wMTYsMTAuOTk5IEwyLjAwOCwxMC45OTkgTDksMS42NSBaIiBpZD0iQ29tYmluZWQtU2hhcGUiIGZpbGw9IiNGRkZGRkYiPjwvcGF0aD4KICAgICAgICAgICAgICAgIDwvZz4KICAgICAgICAgICAgPC9nPgogICAgICAgIDwvZz4KICAgIDwvZz4KPC9zdmc+">
                            <img src="./images/흰색 칸.png">
                            <div>
                                <p><strong>배송지를 등록</strong>하고<br>구매 가능한 상품을 확인하세요!</p>
                                <div>
                                    <button onclick="location.href='${pageContext.request.contextPath }/login';"><span>로그인</span></button>
                                    <button><img src="./images/배송지search_logo.png"><span>주소검색</span></button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="h_second">
                <div class="h_s_1">
                    <div id="s_category">
                        <span></span>
                        <span>카테고리</span>
                        <div>
                            <div>
                                <ul id="s_c_list">
                                    <li class="s_c_list_li" onclick = "location.href='./category.html';">
                                        <div>
                                            <img src="https://collection-image.kurly.com/site-category-groups/55/jZZJOSgsf4R9TAvXrdQ999WW2gTFr0cv0Wd21bla.png" alt="">
                                            <span>선물하기</span>
                                        </div>
                                        <ul>
                                            <li><div><span>홍삼·즙</span></div></li>
                                            <li><div><span>건강식품</span></div></li>
                                            <li><div><span>과일·수산·정육</span></div></li>
                                            <li><div><span>베이커리·커피·차</span></div></li>
                                            <li><div><span>간편식·오일·캔류</span></div></li>
                                            <li><div><span>뷰티·향수·꽃</span></div></li>
                                            <li><div><span>리빙·생활·유아동</span></div></li>
                                        </ul>
                                    </li>
                                    <li class="s_c_list_li" onclick = "location.href='./category.html';">
                                        <div>
                                            <img src="https://collection-image.kurly.com/site-category-groups/6/kwat5Szmq0ONTpMd4hlbcGmCOBd3FsMPyTzWxKBb.png" alt="">
                                            <span>샐러드·간편식</span>
                                        </div>
                                        <ul>
                                            <li><div><span>샐러드·닭가슴살</span></div></li>
                                            <li><div><span>도시락·밥류</span></div></li>
                                            <li><div><span>파스타·면류</span></div></li>
                                            <li><div><span>떡볶이·튀김·순대</span></div></li>
                                            <li><div><span>피자·핫도그·만두</span></div></li>
                                            <li><div><span>폭립·떡갈비·안주</span></div></li>
                                            <li><div><span>죽·스프·카레</span></div></li>
                                            <li><div><span>선식·시리얼</span></div></li>
                                        </ul>
                                    </li>
                                    <li class="s_c_list_li" onclick = "location.href='./category.html';">
                                        <div>
                                            <img src="https://collection-image.kurly.com/site-category-groups/5/CkyoRnUe2q9ngIOLW3bJPRYBw9xq9BHZ3fNQIq1c.png" alt="">
                                            <span>국·반찬·메인요리</span>
                                        </div>
                                        <ul>
                                            <li><div><span>국·탕·찌개</span></div></li>
                                            <li><div><span>밀키트·메인요리</span></div></li>
                                            <li><div><span>밑반찬</span></div></li>
                                            <li><div><span>김치·젓갈·장류</span></div></li>
                                            <li><div><span>두부·어묵·부침개</span></div></li>
                                            <li><div><span>베이컨·햄·통조림</span></div></li>
                                        </ul>
                                    </li>
                                    <li class="s_c_list_li" onclick = "location.href='./category.html';">
                                        <div>
                                            <img src="https://collection-image.kurly.com/site-category-groups/7/CL0LpJynh8Nh2Vqmnm62RVTPePWVU84VkWwQPjdO.png" alt="">
                                            <span>면·양념·오일</span>
                                        </div>
                                        <ul>
                                            <li><div><span>파스타·면류</span></div></li>
                                            <li><div><span>식초·소스·드레싱</span></div></li>
                                            <li><div><span>양념·액젓·장류</span></div></li>
                                            <li><div><span>식용유·참기름·오일</span></div></li>
                                            <li><div><span>소금·설탕·향신료</span></div></li>
                                            <li><div><span>밀가루·가루·믹스</span></div></li>
                                        </ul>
                                    </li>
                                    <li class="s_c_list_li" onclick = "location.href='./category.html';">
                                        <div>
                                            <img src="https://collection-image.kurly.com/site-category-groups/4/jj6zZg2sY94aytlc2k1udIAmWWvmUignR9VYaMcm.png" alt="">
                                            <span>정육·계란</span>
                                        </div>
                                        <ul>
                                            <li><div><span>국내산 소고기</span></div></li>
                                            <li><div><span>수입산 소고기</span></div></li>
                                            <li><div><span>돼지고기</span></div></li>
                                            <li><div><span>계란류</span></div></li>
                                            <li><div><span>닭·오리고기</span></div></li>
                                            <li><div><span>양념육·돈까스</span></div></li>
                                            <li><div><span>양고기</span></div></li>
                                        </ul>
                                    </li>
                                    <li class="s_c_list_li" onclick = "location.href='./category.html';">
                                        <div>
                                            <img src="https://collection-image.kurly.com/site-category-groups/1/4IYbd0CEWkokpqiN00CAL9cDC2Q7nT101TDEn0tF.png" alt="">
                                            <span>채소</span>
                                        </div>
                                        <ul>
                                            <li><div><span>친환경</span></div></li>
                                            <li><div><span>고구마·감자·당근</span></div></li>
                                            <li><div><span>시금치·쌈채소·나물</span></div></li>
                                            <li><div><span>브로콜리·파프리카·양배추</span></div></li>
                                            <li><div><span>양파·대파·마늘·배추</span></div></li>
                                            <li><div><span>오이·호박·고추</span></div></li>
                                            <li><div><span>냉동·이색·간편채소</span></div></li>
                                            <li><div><span>콩나물·버섯</span></div></li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <ul id="s_list">
                        <li onclick = "location.href='./category.html';"><span class="s_click">신상품</span></li>
                        <li onclick = "location.href='./category.html';"><span class="s_click">베스트</span></li>
                        <li onclick = "location.href='./category.html';"><span class="s_click">알뜰쇼핑</span></li>
                        <li onclick = "location.href='./category.html';"><span class="s_click">특가/혜택</span></li>
                    </ul>
                    <div id="s_link">
                        <a><span>샛별 · 낮</span> 배송안내</a>
                    </div>
                </div>
            </div>
        </div>
