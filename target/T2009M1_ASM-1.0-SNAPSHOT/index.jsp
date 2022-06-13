
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/Admin/components/head.jsp">
    <jsp:param name="head" value="dashboard"/>
</jsp:include>
<body>
<jsp:include page="/Admin/components/sidebar.jsp"/>
<jsp:include page="/Admin/components/navbar.jsp"/>
<div class="all-content-wrapper">
    <div class="breadcome-area" style="padding-top: 60px" >
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="breadcome-list">
                        <div class="row">
                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                <div class="breadcome-heading">
                                    <form role="search" class="sr-input-func">
                                        <input type="text" placeholder="Search..." class="search-int form-control">
                                        <a href="#"><i class="fa fa-search"></i></a>
                                    </form>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                <ul class="breadcome-menu">
                                    <li><a href="#">Home</a> <span class="bread-slash"></span>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <table class="table">
                    <thead>
                    <tr>
                        <th scope="col">Id</th>
                        <th scope="col">Name</th>
                        <th scope="col">Price</th>
                        <th scope="col">Description</th>
                        <th scope="col">Thumbnail</th>
                        <th scope="col">Handle</th>
                        <th scope="col">Handle</th>
                        <th scope="col">Handle</th>
                        <th scope="col">Handle</th>
                        <th scope="col">Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>
                            <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                                <button type="button" class="btn btn-danger m-1">Edit</button>
                                <button type="button" class="btn btn-warning m-1">detail</button>
                                <button type="button" class="btn btn-success m-1">delete</button>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <th scope="row">1</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>
                            <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                                <button type="button" class="btn btn-danger m-1">Edit</button>
                                <button type="button" class="btn btn-warning m-1">detail</button>
                                <button type="button" class="btn btn-success m-1">delete</button>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <th scope="row">1</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                        <td>
                            <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                                <button type="button" class="btn btn-danger m-1">Edit</button>
                                <button type="button" class="btn btn-warning m-1">detail</button>
                                <button type="button" class="btn btn-success m-1">delete</button>
                            </div>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

<%--    <div class="analytics-sparkle-area">--%>
<%--        <div class="container-fluid">--%>
<%--            <div class="row">--%>
<%--                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">--%>
<%--                    <div class="analytics-sparkle-line reso-mg-b-30">--%>
<%--                        <div class="analytics-content">--%>
<%--                            <h5>Computer Technologies</h5>--%>
<%--                            <h2>$<span class="counter">5000</span> <span class="tuition-fees">Tuition Fees</span></h2>--%>
<%--                            <span class="text-success">20%</span>--%>
<%--                            <div class="progress m-b-0">--%>
<%--                                <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:20%;"> <span class="sr-only">20% Complete</span> </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">--%>
<%--                    <div class="analytics-sparkle-line reso-mg-b-30">--%>
<%--                        <div class="analytics-content">--%>
<%--                            <h5>Accounting Technologies</h5>--%>
<%--                            <h2>$<span class="counter">3000</span> <span class="tuition-fees">Tuition Fees</span></h2>--%>
<%--                            <span class="text-danger">30%</span>--%>
<%--                            <div class="progress m-b-0">--%>
<%--                                <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:30%;"> <span class="sr-only">230% Complete</span> </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">--%>
<%--                    <div class="analytics-sparkle-line reso-mg-b-30 table-mg-t-pro dk-res-t-pro-30">--%>
<%--                        <div class="analytics-content">--%>
<%--                            <h5>Electrical Engineering</h5>--%>
<%--                            <h2>$<span class="counter">2000</span> <span class="tuition-fees">Tuition Fees</span></h2>--%>
<%--                            <span class="text-info">60%</span>--%>
<%--                            <div class="progress m-b-0">--%>
<%--                                <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:60%;"> <span class="sr-only">20% Complete</span> </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">--%>
<%--                    <div class="analytics-sparkle-line table-mg-t-pro dk-res-t-pro-30">--%>
<%--                        <div class="analytics-content">--%>
<%--                            <h5>Chemical Engineering</h5>--%>
<%--                            <h2>$<span class="counter">3500</span> <span class="tuition-fees">Tuition Fees</span></h2>--%>
<%--                            <span class="text-inverse">80%</span>--%>
<%--                            <div class="progress m-b-0">--%>
<%--                                <div class="progress-bar progress-bar-inverse" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:80%;"> <span class="sr-only">230% Complete</span> </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--    <div class="product-sales-area mg-tb-30">--%>
<%--        <div class="container-fluid">--%>
<%--            <div class="row">--%>
<%--                <div class="col-lg-9 col-md-12 col-sm-12 col-xs-12">--%>
<%--                    <div class="product-sales-chart">--%>
<%--                        <div class="portlet-title">--%>
<%--                            <div class="row">--%>
<%--                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">--%>
<%--                                    <div class="caption pro-sl-hd">--%>
<%--                                        <span class="caption-subject"><b>University Earnings</b></span>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">--%>
<%--                                    <div class="actions graph-rp graph-rp-dl">--%>
<%--                                        <p>All Earnings are in million $</p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                        <ul class="list-inline cus-product-sl-rp">--%>
<%--                            <li>--%>
<%--                                <h5><i class="fa fa-circle" style="color: #006DF0;"></i>CSE</h5>--%>
<%--                            </li>--%>
<%--                            <li>--%>
<%--                                <h5><i class="fa fa-circle" style="color: #933EC5;"></i>Accounting</h5>--%>
<%--                            </li>--%>
<%--                            <li>--%>
<%--                                <h5><i class="fa fa-circle" style="color: #65b12d;"></i>Electrical</h5>--%>
<%--                            </li>--%>
<%--                        </ul>--%>
<%--                        <div id="extra-area-chart" style="height: 356px;"></div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">--%>
<%--                    <div class="white-box analytics-info-cs mg-b-10 res-mg-b-30 res-mg-t-30 table-mg-t-pro-n tb-sm-res-d-n dk-res-t-d-n">--%>
<%--                        <h3 class="box-title">Total Visit</h3>--%>
<%--                        <ul class="list-inline two-part-sp">--%>
<%--                            <li>--%>
<%--                                <div id="sparklinedash"></div>--%>
<%--                            </li>--%>
<%--                            <li class="text-right sp-cn-r"><i class="fa fa-level-up" aria-hidden="true"></i> <span class="counter text-success">1500</span></li>--%>
<%--                        </ul>--%>
<%--                    </div>--%>
<%--                    <div class="white-box analytics-info-cs mg-b-10 res-mg-b-30 tb-sm-res-d-n dk-res-t-d-n">--%>
<%--                        <h3 class="box-title">Page Views</h3>--%>
<%--                        <ul class="list-inline two-part-sp">--%>
<%--                            <li>--%>
<%--                                <div id="sparklinedash2"></div>--%>
<%--                            </li>--%>
<%--                            <li class="text-right graph-two-ctn"><i class="fa fa-level-up" aria-hidden="true"></i> <span class="counter text-purple">3000</span></li>--%>
<%--                        </ul>--%>
<%--                    </div>--%>
<%--                    <div class="white-box analytics-info-cs mg-b-10 res-mg-b-30 tb-sm-res-d-n dk-res-t-d-n">--%>
<%--                        <h3 class="box-title">Unique Visitor</h3>--%>
<%--                        <ul class="list-inline two-part-sp">--%>
<%--                            <li>--%>
<%--                                <div id="sparklinedash3"></div>--%>
<%--                            </li>--%>
<%--                            <li class="text-right graph-three-ctn"><i class="fa fa-level-up" aria-hidden="true"></i> <span class="counter text-info">5000</span></li>--%>
<%--                        </ul>--%>
<%--                    </div>--%>
<%--                    <div class="white-box analytics-info-cs table-dis-n-pro tb-sm-res-d-n dk-res-t-d-n">--%>
<%--                        <h3 class="box-title">Bounce Rate</h3>--%>
<%--                        <ul class="list-inline two-part-sp">--%>
<%--                            <li>--%>
<%--                                <div id="sparklinedash4"></div>--%>
<%--                            </li>--%>
<%--                            <li class="text-right graph-four-ctn"><i class="fa fa-level-down" aria-hidden="true"></i> <span class="text-danger"><span class="counter">18</span>%</span>--%>
<%--                            </li>--%>
<%--                        </ul>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--    <div class="traffic-analysis-area">--%>
<%--        <div class="container-fluid">--%>
<%--            <div class="row">--%>
<%--                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">--%>
<%--                    <div class="social-media-edu">--%>
<%--                        <i class="fa fa-facebook"></i>--%>
<%--                        <div class="social-edu-ctn">--%>
<%--                            <h3>50k Likes</h3>--%>
<%--                            <p>You main list growing</p>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">--%>
<%--                    <div class="social-media-edu twitter-cl res-mg-t-30 table-mg-t-pro-n">--%>
<%--                        <i class="fa fa-twitter"></i>--%>
<%--                        <div class="social-edu-ctn">--%>
<%--                            <h3>30k followers</h3>--%>
<%--                            <p>You main list growing</p>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">--%>
<%--                    <div class="social-media-edu linkedin-cl res-mg-t-30 res-tablet-mg-t-30 dk-res-t-pro-30">--%>
<%--                        <i class="fa fa-linkedin"></i>--%>
<%--                        <div class="social-edu-ctn">--%>
<%--                            <h3>7k Connections</h3>--%>
<%--                            <p>You main list growing</p>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">--%>
<%--                    <div class="social-media-edu youtube-cl res-mg-t-30 res-tablet-mg-t-30 dk-res-t-pro-30">--%>
<%--                        <i class="fa fa-youtube"></i>--%>
<%--                        <div class="social-edu-ctn">--%>
<%--                            <h3>50k Subscribers</h3>--%>
<%--                            <p>You main list growing</p>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--    <div class="library-book-area mg-t-30">--%>
<%--        <div class="container-fluid">--%>
<%--            <div class="row">--%>
<%--                <div class="col-lg-4 col-md-6 col-sm-6 col-xs-12">--%>
<%--                    <div class="single-cards-item">--%>
<%--                        <div class="single-product-image">--%>
<%--                            <a href="#"><img src="Admin/assets/img/product/profile-bg.jpg" alt=""></a>--%>
<%--                        </div>--%>
<%--                        <div class="single-product-text">--%>
<%--                            <img src="Admin/assets/img/product/pro4.jpg" alt="">--%>
<%--                            <h4><a class="cards-hd-dn" href="#">Angela Dominic</a></h4>--%>
<%--                            <h5>Web Designer & Developer</h5>--%>
<%--                            <p class="ctn-cards">Lorem ipsum dolor sit amet, this is a consectetur adipisicing elit</p>--%>
<%--                            <a class="follow-cards" href="#">Follow</a>--%>
<%--                            <div class="row">--%>
<%--                                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">--%>
<%--                                    <div class="cards-dtn">--%>
<%--                                        <h3><span class="counter">199</span></h3>--%>
<%--                                        <p>Articles</p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">--%>
<%--                                    <div class="cards-dtn">--%>
<%--                                        <h3><span class="counter">599</span></h3>--%>
<%--                                        <p>Like</p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">--%>
<%--                                    <div class="cards-dtn">--%>
<%--                                        <h3><span class="counter">399</span></h3>--%>
<%--                                        <p>Comment</p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-4 col-md-6 col-sm-6 col-xs-12">--%>
<%--                    <div class="single-review-st-item res-mg-t-30 table-mg-t-pro-n">--%>
<%--                        <div class="single-review-st-hd">--%>
<%--                            <h2>Reviews</h2>--%>
<%--                        </div>--%>
<%--                        <div class="single-review-st-text">--%>
<%--                            <img src="Admin/assets/img/notification/1.jpg" alt="">--%>
<%--                            <div class="review-ctn-hf">--%>
<%--                                <h3>Sarah Graves</h3>--%>
<%--                                <p>Highly recommend</p>--%>
<%--                            </div>--%>
<%--                            <div class="review-item-rating">--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star-half"></i>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                        <div class="single-review-st-text">--%>
<%--                            <img src="Admin/assets/img/notification/2.jpg" alt="">--%>
<%--                            <div class="review-ctn-hf">--%>
<%--                                <h3>Garbease sha</h3>--%>
<%--                                <p>Awesome Pro</p>--%>
<%--                            </div>--%>
<%--                            <div class="review-item-rating">--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star-half"></i>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                        <div class="single-review-st-text">--%>
<%--                            <img src="Admin/assets/img/notification/3.jpg" alt="">--%>
<%--                            <div class="review-ctn-hf">--%>
<%--                                <h3>Gobetro pro</h3>--%>
<%--                                <p>Great Website</p>--%>
<%--                            </div>--%>
<%--                            <div class="review-item-rating">--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star-half"></i>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                        <div class="single-review-st-text">--%>
<%--                            <img src="Admin/assets/img/notification/4.jpg" alt="">--%>
<%--                            <div class="review-ctn-hf">--%>
<%--                                <h3>Siam Graves</h3>--%>
<%--                                <p>That's Good</p>--%>
<%--                            </div>--%>
<%--                            <div class="review-item-rating">--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star-half"></i>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                        <div class="single-review-st-text">--%>
<%--                            <img src="Admin/assets/img/notification/5.jpg" alt="">--%>
<%--                            <div class="review-ctn-hf">--%>
<%--                                <h3>Sarah Graves</h3>--%>
<%--                                <p>Highly recommend</p>--%>
<%--                            </div>--%>
<%--                            <div class="review-item-rating">--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star-half"></i>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                        <div class="single-review-st-text">--%>
<%--                            <img src="Admin/assets/img/notification/6.jpg" alt="">--%>
<%--                            <div class="review-ctn-hf">--%>
<%--                                <h3>Julsha Grav</h3>--%>
<%--                                <p>Sei Hoise bro</p>--%>
<%--                            </div>--%>
<%--                            <div class="review-item-rating">--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star"></i>--%>
<%--                                <i class="educate-icon educate-star-half"></i>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">--%>
<%--                    <div class="single-product-item res-mg-t-30 table-mg-t-pro-n tb-sm-res-d-n dk-res-t-d-n">--%>
<%--                        <div class="single-product-image">--%>
<%--                            <a href="#"><img src="Admin/assets/img/product/book-4.jpg" alt=""></a>--%>
<%--                        </div>--%>
<%--                        <div class="single-product-text edu-pro-tx">--%>
<%--                            <h4><a href="#">Title Demo Here</a></h4>--%>
<%--                            <h5>Lorem ipsum dolor sit amet, this is a consec tetur adipisicing elit</h5>--%>
<%--                            <div class="product-price">--%>
<%--                                <h3>$45</h3>--%>
<%--                                <div class="single-item-rating">--%>
<%--                                    <i class="educate-icon educate-star"></i>--%>
<%--                                    <i class="educate-icon educate-star"></i>--%>
<%--                                    <i class="educate-icon educate-star"></i>--%>
<%--                                    <i class="educate-icon educate-star"></i>--%>
<%--                                    <i class="educate-icon educate-star-half"></i>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="product-buttons">--%>
<%--                                <button type="button" class="button-default cart-btn">Read More</button>--%>
<%--                                <button type="button" class="button-default"><i class="fa fa-heart"></i></button>--%>
<%--                                <button type="button" class="button-default"><i class="fa fa-share"></i></button>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
</div>
<jsp:include page="/Admin/components/footer.jsp"/>
<jsp:include page="/Admin/components/scripts.jsp"/>
</body>
</html>
