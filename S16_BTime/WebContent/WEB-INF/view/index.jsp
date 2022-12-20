<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&family=Noto+Sans:wght@100&display=swap" rel="stylesheet">
    <link rel="stylesteet" href="${pageContext.request.contextPath }/css/rest.css">
    <link rel="stylesteet" href="${pageContext.request.contextPath }/css/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/main_share_section.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/main_section01.css">
    <script src="${pageContext.request.contextPath }./js/jquery-3.6.1.js"></script>
    <script src="${pageContext.request.contextPath }/js/main_share_scroll_action.js"></script>
    <script src="${pageContext.request.contextPath }/js/main_header.js"></script>
    <script src="${pageContext.request.contextPath }/js/index_section_action.js"></script>
    <title>메인페이지</title>
    <!-- 전체공통 -->
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap');
        html, button, input, select, textarea, span, a, p {
            font-family: "Noto Sans KR", "malgun gothic", /*AppleGothic*/dotum, sans-serif;
        }
    </style>
</head>
<body>
    <div>
    <!-- header -->
    <%@include file="/WEB-INF/view/header.jsp" %>
        <div id="section">
            <div class="main_section">
                <!-- 맨위 상단 섹션-->
                <div>
                    <div class="m_s_top">
                        <div class="m_s_top_swiper_wrap">
                            <div class="m_s_top_swiper">
                                <div><a><img src="./images/메인섹션 맨상단1.avif"></a></div>
                                <div><a><img src="./images/메인섹션 맨상단2.avif"></a></div>
                                <div><a><img src="./images/메인섹션 맨상단3.avif"></a></div>
                                <div><a><img src="./images/메인섹션 맨상단1.avif"></a></div>
                            </div>
                            <button id="m_s_top_bLeft"></button>
                            <button id="m_s_top_bRight"></button>
                            <div class="m_s_top_text">1 / 3</div>
                        </div>
                    </div>
                </div>
                <!-- 첫번째 섹션 -->
                <div>               
                    <div class="m_s_1">
                        <div class="m_s_1_title">
                            <div class="m_s_1_title_1">
                                <span class="m_s_1_title_1_span">
                                    이 상품 어때요?
                                </span>
                            </div>
                        </div>
                        <div class="m_s_1_list">
                            <div class="m_s_1_list_swiper">
                                <div class="m_s_1_list_swiper_wrap">     
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_1_list_1">
                                        <div class="m_s_1_list_1_product">
                                            <div class="m_s_1_list_1_product_1">
                                                <div class="m_s_1_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_1_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_1_list_1_product_1_content">
                                                    <h3 class="m_s_1_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_1_list_1_product_1_content_price">
                                                        <div class="m_s_1_list_1_product_1_content_price_1">
                                                            <span class="m_s_1_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <button type="button" id="m_s_1_list_button_left"></button>
                            <button type="button" id="m_s_1_list_button_right"></button>
                        </div>
                    </div>
                </div>
                <!-- 상단 버튼 추가 섹션 -->
                <div>               
                    <div class="m_s_4">
                        <div class="m_s_4_title">
                            <div class="m_s_4_title_1">
                                <span class="m_s_4_title_1_span">
                                    MD의 추천
                                </span>
                            </div>
                        </div>
                        <ul class="m_s_4_ul">
                            <li>
                                <button type="button" class="m_s_4_ul_button">샐러드·간편식</button>
                            </li>
                            <li>
                                <button type="button" class="m_s_4_ul_button">국·반찬·메인요리</button>
                            </li>
                            <li>
                                <button type="button" class="m_s_4_ul_button">면·양념·오일</button>
                            </li>
                            <li>
                                <button type="button" class="m_s_4_ul_button">정육·계란</button>
                            </li>
                            <li>
                                <button type="button" class="m_s_4_ul_button">채소</button>
                            </li>
                        </ul>
                        <div class="m_s_4_list">
                            <div class="m_s_4_list_swiper">
                                <div class="m_s_4_list_swiper_wrap">
                                    <div class="m_s_4_list_1">
                                        <div class="m_s_4_list_1_product">
                                            <div class="m_s_4_list_1_product_1">
                                                <div class="m_s_4_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1514440709588l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_4_list_1_product_1_button" onclick = "location.href='./shopping_basket_loggedIn.html';">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘" >
                                                    </button>
                                                </div>
                                                <div class="m_s_4_list_1_product_1_content">
                                                    <h3 class="m_s_4_list_1_product_1_content_title">
                                                        [LOTS OF LOVE] 입맛듬뿍 불낙볶음밥 (리뉴얼)
                                                    </h3>
                                                    <div class="m_s_4_list_1_product_1_content_price">
                                                        <div class="m_s_4_list_1_product_1_content_price_1">
                                                            <span class="m_s_4_list_1_product_1_content_price_1_1">
                                                                6,800 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_4_list_1">
                                        <div class="m_s_4_list_1_product">
                                            <div class="m_s_4_list_1_product_1">
                                                <div class="m_s_4_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1514440709588l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_4_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘" onclick= "location.href='./shopping_basket_loggedIn.html';">
                                                    </button>
                                                </div>
                                                <div class="m_s_4_list_1_product_1_content">
                                                    <h3 class="m_s_4_list_1_product_1_content_title">
                                                        [LOTS OF LOVE] 입맛듬뿍 불낙볶음밥 (리뉴얼)
                                                    </h3>
                                                    <div class="m_s_4_list_1_product_1_content_price">
                                                        <div class="m_s_4_list_1_product_1_content_price_1">
                                                            <span class="m_s_4_list_1_product_1_content_price_1_1">
                                                                6,800 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_4_list_1">
                                        <div class="m_s_4_list_1_product">
                                            <div class="m_s_4_list_1_product_1">
                                                <div class="m_s_4_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1514440709588l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_4_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_4_list_1_product_1_content">
                                                    <h3 class="m_s_4_list_1_product_1_content_title">
                                                        [LOTS OF LOVE] 입맛듬뿍 불낙볶음밥 (리뉴얼)
                                                    </h3>
                                                    <div class="m_s_4_list_1_product_1_content_price">
                                                        <div class="m_s_4_list_1_product_1_content_price_1">
                                                            <span class="m_s_4_list_1_product_1_content_price_1_1">
                                                                6,800 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_4_list_1">
                                        <div class="m_s_4_list_1_product">
                                            <div class="m_s_4_list_1_product_1">
                                                <div class="m_s_4_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1514440709588l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_4_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_4_list_1_product_1_content">
                                                    <h3 class="m_s_4_list_1_product_1_content_title">
                                                        [LOTS OF LOVE] 입맛듬뿍 불낙볶음밥 (리뉴얼)
                                                    </h3>
                                                    <div class="m_s_4_list_1_product_1_content_price">
                                                        <div class="m_s_4_list_1_product_1_content_price_1">
                                                            <span class="m_s_4_list_1_product_1_content_price_1_1">
                                                                6,800 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_4_list_1">
                                        <div class="m_s_4_list_1_product">
                                            <div class="m_s_4_list_1_product_1">
                                                <div class="m_s_4_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1653038246425l0.jpeg" alt="상품 이미지">
                                                    <button type="button" class="m_s_4_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_4_list_1_product_1_content">
                                                    <h3 class="m_s_4_list_1_product_1_content_title">
                                                        춘천 국물 닭갈비 떡볶이
                                                    </h3>
                                                    <div class="m_s_4_list_1_product_1_content_price">
                                                        <div class="m_s_4_list_1_product_1_content_price_1">
                                                            <span class="m_s_4_list_1_product_1_content_price_1_1">
                                                                12,500 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_4_list_1">
                                        <div class="m_s_4_list_1_product">
                                            <div class="m_s_4_list_1_product_1">
                                                <div class="m_s_4_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1653038246425l0.jpeg" alt="상품 이미지">
                                                    <button type="button" class="m_s_4_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_4_list_1_product_1_content">
                                                    <h3 class="m_s_4_list_1_product_1_content_title">
                                                        춘천 국물 닭갈비 떡볶이
                                                    </h3>
                                                    <div class="m_s_4_list_1_product_1_content_price">
                                                        <div class="m_s_4_list_1_product_1_content_price_1">
                                                            <span class="m_s_4_list_1_product_1_content_price_1_1">
                                                                12,500 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div><div class="m_s_4_list_1">
                                        <div class="m_s_4_list_1_product">
                                            <div class="m_s_4_list_1_product_1">
                                                <div class="m_s_4_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1653038246425l0.jpeg" alt="상품 이미지">
                                                    <button type="button" class="m_s_4_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_4_list_1_product_1_content">
                                                    <h3 class="m_s_4_list_1_product_1_content_title">
                                                        춘천 국물 닭갈비 떡볶이
                                                    </h3>
                                                    <div class="m_s_4_list_1_product_1_content_price">
                                                        <div class="m_s_4_list_1_product_1_content_price_1">
                                                            <span class="m_s_4_list_1_product_1_content_price_1_1">
                                                                12,500 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div><div class="m_s_4_list_1">
                                        <div class="m_s_4_list_1_product">
                                            <div class="m_s_4_list_1_product_1">
                                                <div class="m_s_4_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1653038246425l0.jpeg" alt="상품 이미지">
                                                    <button type="button" class="m_s_4_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_4_list_1_product_1_content">
                                                    <h3 class="m_s_4_list_1_product_1_content_title">
                                                        춘천 국물 닭갈비 떡볶이
                                                    </h3>
                                                    <div class="m_s_4_list_1_product_1_content_price">
                                                        <div class="m_s_4_list_1_product_1_content_price_1">
                                                            <span class="m_s_4_list_1_product_1_content_price_1_1">
                                                                12,500 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_4_list_1">
                                        <div class="m_s_4_list_1_product">
                                            <div class="m_s_4_list_1_product_1">
                                                <div class="m_s_4_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_4_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_4_list_1_product_1_content">
                                                    <h3 class="m_s_4_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_4_list_1_product_1_content_price">
                                                        <div class="m_s_4_list_1_product_1_content_price_1">
                                                            <span class="m_s_4_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_4_list_1">
                                        <div class="m_s_4_list_1_product">
                                            <div class="m_s_4_list_1_product_1">
                                                <div class="m_s_4_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_4_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_4_list_1_product_1_content">
                                                    <h3 class="m_s_4_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_4_list_1_product_1_content_price">
                                                        <div class="m_s_4_list_1_product_1_content_price_1">
                                                            <span class="m_s_4_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_4_list_1">
                                        <div class="m_s_4_list_1_product">
                                            <div class="m_s_4_list_1_product_1">
                                                <div class="m_s_4_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_4_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_4_list_1_product_1_content">
                                                    <h3 class="m_s_4_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_4_list_1_product_1_content_price">
                                                        <div class="m_s_4_list_1_product_1_content_price_1">
                                                            <span class="m_s_4_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_4_list_1">
                                        <div class="m_s_4_list_1_product">
                                            <div class="m_s_4_list_1_product_1">
                                                <div class="m_s_4_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_4_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_4_list_1_product_1_content">
                                                    <h3 class="m_s_4_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_4_list_1_product_1_content_price">
                                                        <div class="m_s_4_list_1_product_1_content_price_1">
                                                            <span class="m_s_4_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    
                                </div>
                            </div>
                            <button type="button" id="m_s_4_list_button_left"></button>
                            <button type="button" id="m_s_4_list_button_right"></button>
                        </div>
                        <a href="./category.html" class="m_s_4_a"><span class="m_s_4_a_span">샐러드·간편식 전체보기</span></a>
                    </div>
                </div>
                <!-- 상단 버튼 추가 섹션 -->
                <div>               
                    <div class="m_s_5">
                        <div class="m_s_5_title">
                            <div class="m_s_5_title_1">
                                <span class="m_s_5_title_1_span_1">
                                    지금 가장 핫한 상품
                                </span>
                                <span class="m_s_5_title_1_span_2">
                                    <img src="./images/섹션타이틀이동.svg" alt="더보기 아이콘">
                                </span>
                            </div>
                        </div>
                        <div class="m_s_5_list">
                            <div class="m_s_5_list_swiper">
                                <div class="m_s_5_list_swiper_wrap">
                                    <div class="m_s_5_list_1">
                                        <div class="m_s_5_list_1_product">
                                            <div class="m_s_5_list_1_product_1">
                                                <div class="m_s_5_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1653038246425l0.jpeg" alt="상품 이미지">
                                                    <button type="button" class="m_s_5_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_5_list_1_product_1_content">
                                                    <h3 class="m_s_5_list_1_product_1_content_title">
                                                        춘천 국물 닭갈비 떡볶이
                                                    </h3>
                                                    <div class="m_s_5_list_1_product_1_content_price">
                                                        <div class="m_s_5_list_1_product_1_content_price_1">
                                                            <span class="m_s_5_list_1_product_1_content_price_1_1">
                                                                12,500 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_5_list_1">
                                        <div class="m_s_5_list_1_product">
                                            <div class="m_s_5_list_1_product_1">
                                                <div class="m_s_5_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1653038246425l0.jpeg" alt="상품 이미지">
                                                    <button type="button" class="m_s_5_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_5_list_1_product_1_content">
                                                    <h3 class="m_s_5_list_1_product_1_content_title">
                                                        춘천 국물 닭갈비 떡볶이
                                                    </h3>
                                                    <div class="m_s_5_list_1_product_1_content_price">
                                                        <div class="m_s_5_list_1_product_1_content_price_1">
                                                            <span class="m_s_5_list_1_product_1_content_price_1_1">
                                                                12,500 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_5_list_1">
                                        <div class="m_s_5_list_1_product">
                                            <div class="m_s_5_list_1_product_1">
                                                <div class="m_s_5_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1653038246425l0.jpeg" alt="상품 이미지">
                                                    <button type="button" class="m_s_5_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_5_list_1_product_1_content">
                                                    <h3 class="m_s_5_list_1_product_1_content_title">
                                                        춘천 국물 닭갈비 떡볶이
                                                    </h3>
                                                    <div class="m_s_5_list_1_product_1_content_price">
                                                        <div class="m_s_5_list_1_product_1_content_price_1">
                                                            <span class="m_s_5_list_1_product_1_content_price_1_1">
                                                                12,500 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_5_list_1">
                                        <div class="m_s_5_list_1_product">
                                            <div class="m_s_5_list_1_product_1">
                                                <div class="m_s_5_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1653038246425l0.jpeg" alt="상품 이미지">
                                                    <button type="button" class="m_s_5_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_5_list_1_product_1_content">
                                                    <h3 class="m_s_5_list_1_product_1_content_title">
                                                        춘천 국물 닭갈비 떡볶이
                                                    </h3>
                                                    <div class="m_s_5_list_1_product_1_content_price">
                                                        <div class="m_s_5_list_1_product_1_content_price_1">
                                                            <span class="m_s_5_list_1_product_1_content_price_1_1">
                                                                12,500 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_5_list_1">
                                        <div class="m_s_5_list_1_product">
                                            <div class="m_s_5_list_1_product_1">
                                                <div class="m_s_5_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_5_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_5_list_1_product_1_content">
                                                    <h3 class="m_s_5_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_5_list_1_product_1_content_price">
                                                        <div class="m_s_5_list_1_product_1_content_price_1">
                                                            <span class="m_s_5_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_5_list_1">
                                        <div class="m_s_5_list_1_product">
                                            <div class="m_s_5_list_1_product_1">
                                                <div class="m_s_5_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_5_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_5_list_1_product_1_content">
                                                    <h3 class="m_s_5_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_5_list_1_product_1_content_price">
                                                        <div class="m_s_5_list_1_product_1_content_price_1">
                                                            <span class="m_s_5_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_5_list_1">
                                        <div class="m_s_5_list_1_product">
                                            <div class="m_s_5_list_1_product_1">
                                                <div class="m_s_5_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_5_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_5_list_1_product_1_content">
                                                    <h3 class="m_s_5_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_5_list_1_product_1_content_price">
                                                        <div class="m_s_5_list_1_product_1_content_price_1">
                                                            <span class="m_s_5_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_5_list_1">
                                        <div class="m_s_5_list_1_product">
                                            <div class="m_s_5_list_1_product_1">
                                                <div class="m_s_5_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1654826608504l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_5_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_5_list_1_product_1_content">
                                                    <h3 class="m_s_5_list_1_product_1_content_title">
                                                        [워커힐] 전복 삼계탕
                                                    </h3>
                                                    <div class="m_s_5_list_1_product_1_content_price">
                                                        <div class="m_s_5_list_1_product_1_content_price_1">
                                                            <span class="m_s_5_list_1_product_1_content_price_1_1">
                                                                34,000 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_5_list_1">
                                        <div class="m_s_5_list_1_product">
                                            <div class="m_s_5_list_1_product_1">
                                                <div class="m_s_5_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1514440709588l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_5_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_5_list_1_product_1_content">
                                                    <h3 class="m_s_5_list_1_product_1_content_title">
                                                        [LOTS OF LOVE] 입맛듬뿍 불낙볶음밥 (리뉴얼)
                                                    </h3>
                                                    <div class="m_s_5_list_1_product_1_content_price">
                                                        <div class="m_s_5_list_1_product_1_content_price_1">
                                                            <span class="m_s_5_list_1_product_1_content_price_1_1">
                                                                6,800 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_5_list_1">
                                        <div class="m_s_5_list_1_product">
                                            <div class="m_s_5_list_1_product_1">
                                                <div class="m_s_5_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1514440709588l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_5_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_5_list_1_product_1_content">
                                                    <h3 class="m_s_5_list_1_product_1_content_title">
                                                        [LOTS OF LOVE] 입맛듬뿍 불낙볶음밥 (리뉴얼)
                                                    </h3>
                                                    <div class="m_s_5_list_1_product_1_content_price">
                                                        <div class="m_s_5_list_1_product_1_content_price_1">
                                                            <span class="m_s_5_list_1_product_1_content_price_1_1">
                                                                6,800 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_5_list_1">
                                        <div class="m_s_5_list_1_product">
                                            <div class="m_s_5_list_1_product_1">
                                                <div class="m_s_5_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1514440709588l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_5_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_5_list_1_product_1_content">
                                                    <h3 class="m_s_5_list_1_product_1_content_title">
                                                        [LOTS OF LOVE] 입맛듬뿍 불낙볶음밥 (리뉴얼)
                                                    </h3>
                                                    <div class="m_s_5_list_1_product_1_content_price">
                                                        <div class="m_s_5_list_1_product_1_content_price_1">
                                                            <span class="m_s_5_list_1_product_1_content_price_1_1">
                                                                6,800 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="m_s_5_list_1">
                                        <div class="m_s_5_list_1_product">
                                            <div class="m_s_5_list_1_product_1">
                                                <div class="m_s_5_list_1_product_1_img">
                                                    <img src="https://img-cf.kurly.com/cdn-cgi/image/width=400,format=auto/shop/data/goods/1514440709588l0.jpg" alt="상품 이미지">
                                                    <button type="button" class="m_s_5_list_1_product_1_button">
                                                        <img src="./images/상품_장바구니.svg" alt="장바구니 아이콘">
                                                    </button>
                                                </div>
                                                <div class="m_s_5_list_1_product_1_content">
                                                    <h3 class="m_s_5_list_1_product_1_content_title">
                                                        [LOTS OF LOVE] 입맛듬뿍 불낙볶음밥 (리뉴얼)
                                                    </h3>
                                                    <div class="m_s_5_list_1_product_1_content_price">
                                                        <div class="m_s_5_list_1_product_1_content_price_1">
                                                            <span class="m_s_5_list_1_product_1_content_price_1_1">
                                                                6,800 원
                                                            </span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <button type="button" id="m_s_5_list_button_left"></button>
                            <button type="button" id="m_s_5_list_button_right"></button>
                        </div>
                    </div>
                </div>
                <!-- 컬리의 레시피 section -->
                <div>
                    <div class="m_s_2">
                        <div class="m_s_2_title">
                            <div class="m_s_2_title_1">
                                <span class="m_s_2_title_1_span_1">
                                    컬리의 레시피
                                </span>
                                <span class="m_s_2_title_1_span_2">
                                    <img src="./images/섹션타이틀이동.svg" alt="더보기 아이콘">
                                </span>
                            </div>
                        </div>
                        <div class="m_s_2_list">
                            <div class="m_s_2_list_swiper">
                                <div class="m_s_2_list_swiper_wrap">
                                    <div class="m_s_2_list_1">
                                        <div class="m_s_2_list_1_product">
                                            <a href="./recipe_page.html" class="m_s_2_list_1_product_a">
                                                <div class="m_s_2_list_1_product_a_img">
                                                    <img src="./images/로스티드 닭 다리_날개.webp">
                                                </div>
                                                <div class="m_s_2_list_1_product_a_d">
                                                    로스티드 닭 다리&날개
                                                </div>
                                            </a>
                                        </div>
                                        <div class="m_s_2_list_1_product">
                                            <a href="./recipe_page.html" class="m_s_2_list_1_product_a">
                                                <div class="m_s_2_list_1_product_a_img">
                                                    <img src="./images/로스티드 닭 다리_날개.webp">
                                                </div>
                                                <div class="m_s_2_list_1_product_a_d">
                                                    로스티드 닭 다리&날개
                                                </div>
                                            </a>
                                        </div>
                                        <div class="m_s_2_list_1_product">
                                            <a href="./recipe_page.html" class="m_s_2_list_1_product_a">
                                                <div class="m_s_2_list_1_product_a_img">
                                                    <img src="./images/로스티드 닭 다리_날개.webp">
                                                </div>
                                                <div class="m_s_2_list_1_product_a_d">
                                                    로스티드 닭 다리&날개
                                                </div>
                                            </a>
                                        </div>
                                        <div class="m_s_2_list_1_product">
                                            <a href="./recipe_page.html" class="m_s_2_list_1_product_a">
                                                <div class="m_s_2_list_1_product_a_img">
                                                    <img src="./images/로스티드 닭 다리_날개.webp">
                                                </div>
                                                <div class="m_s_2_list_1_product_a_d">
                                                    로스티드 닭 다리&날개
                                                </div>
                                            </a>
                                        </div>
                                        <div class="m_s_2_list_1_product">
                                            <a href="./recipe_page.html" class="m_s_2_list_1_product_a">
                                                <div class="m_s_2_list_1_product_a_img">
                                                    <img src="./images/로스티드 닭 다리_날개.webp">
                                                </div>
                                                <div class="m_s_2_list_1_product_a_d">
                                                    로스티드 닭 다리&날개
                                                </div>
                                            </a>
                                        </div>
                                        <div class="m_s_2_list_1_product">
                                            <div class="m_s_2_list_1_product_icon">
                                                <div class="m_s_2_list_1_product_icon_1">
                                                    <span></span>
                                                    <span>전체보기</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <button type="button" id="m_s_2_list_button_left"></button>
                            <button type="button" id="m_s_2_list_button_right"></button>
                        </div>
                    </div>
                </div>
                <!-- 광고 -->
                <div>
                    <div class="m_s_a">
                        <div class="m_s_a_1">
                            <a class="m_s_a_1_1">
                                <img src="./images/광고.webp" alt>
                            </a>
                        </div>
                    </div>
                </div>
                <!-- 3번째 section - instagram -->
                <div>
                    <div class="m_s_3">
                        <div class="m_s_3_title">
                            <div><span>인스타그램 고객 후기</span></div>
                            <p>더 많은 고객 후기가 궁금하다면?</p>
                        </div>
                        <div class="m_s_3_list">
                            <button type="button" id="insta_fButton"></button>
                            <div class="m_s_3_list_swiper">
                                <div class="m_s_3_list_swiper_wrap">
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img1.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img1.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img1.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img1.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img1.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img1.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img2.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img2.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img2.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img2.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img2.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img2.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img3.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img3.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img3.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img3.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img3.jpg"></a></div>
                                    <div class="insta_div"><a href="https://www.instagram.com/marketkurly_regram/"><img src="./images/instagram_img3.jpg"></a></div>
                                </div>
                            </div>
                            <button type="button" id="insta_sButton"></button>
                        </div>
                        <div class="m_s_3_tlink">
                            <p>더 많은 고객 후기가 궁금하다면?</p>
                            <a href="https://www.instagram.com/marketkurly_regram/" target="_blank" rel="nooperner noreferrer">@marketkurly_regram</a>
                        </div>
                    </div>
                </div>
            </div>
            <div id="scrollup">
                <a href="#">
                    <span></span>
                </a>
            </div>
            <%@include file="/WEB-INF/view/rightNav.jsp" %>
        </div>
        <!-- footer -->
        <%@include file="/WEB-INF/view/footer.jsp" %>
    </div>
</body>
</html>