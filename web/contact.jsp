
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>contact</title>
    </head>
    <body>

        <jsp:include page="header.jsp"></jsp:include>

            <div class="container">
                <div class="contact">
                    <h2 class=" contact-in">Liên Hệ</h2>

                    <div class="col-md-6 contact-top">
                        <h3>Info</h3>
                        <div class="map">
                            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d37494223.23909492!2d103!3d55!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x453c569a896724fb%3A0x1409fdf86611f613!2sRussia!5e0!3m2!1sen!2sin!4v1415776049771"></iframe>
                        </div>

                        <p> Hus shop nhóm 5 - Môn Công nghệ phần mềm - Trường ĐHKHTN </p>
                       				
                        <ul class="social ">
                            <li><span><i > </i>181 Nguyễn Trãi Thanh Xuân  </span></li>
                            <li><span><i class="down"> </i>+ 00 123 456 7890</span></li>
                            <li><a href="mailto:info@example.com"><i class="mes"> </i>hushop@gmail.com</a></li>
                        </ul>
                    </div>
                    <div class="col-md-6 contact-top">
                        <h3>Liên hệ với shop</h3>
                        <div>
                            <span>Tên của bạn </span>		
                            <input type="text" value="" >						
                        </div>
                        <div>
                            <span> Email </span>		
                            <input type="text" value="" >						
                        </div>
                        <div>
                            <span>Tiêu đề </span>		
                            <input type="text" value="" >	
                        </div>
                        <div>
                            <span>Tin nhắn</span>		
                            <textarea> </textarea>	
                        </div>
                        <input type="submit" value="SEND" >	
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>

        <jsp:include page="footer.jsp"></jsp:include>

    </body>
</html>
