<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/18/2023
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
    <form:form action="/user/create" method="post" modelAttribute="user">
        <div class="row">
            <div class="col-12">
                <h3>TỜ KHAI Y TẾ</h3>
            </div>
        </div>
        <div class="row">
            <div class="col-12">
                <p style="font-synthesis-weight: inherit">
                    ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIÊT ĐỀ
                    PHÒNG CHỐNG DỊCH B
                </p>
            </div>
        </div>
        <div class="row">
            <div class="col-12">
                <p style="text-align: center; color: red">
                    Khuyến cáo : Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự
                </p>
            </div>
        </div>
        <div class="row">
            <div class="col-12">
                <p>Họ Tên(ghi chữ In Hoa) <span style="color: red">(*)</span></p>
                <form:input path="fullname"/>
            </div>
        </div>
        <div class="row">
            <div class="col-4">
                <div class="row">
                    <div class="col-12">
                        <label >Năm Sinh <span style="color: red">(*)</span></label>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <form:input path="yearDate"/>
                    </div>
                </div>
            </div>
            <div class="col-4">
                <div class="row">
                    <div class="col-12">
                        <form:label path="gender"/>Giới tính <span style="color: red">(*)</span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <form:select path="gender"/>-- chọn --
                        <form:option value="1"/>Nam
                        <form:option value="2"/>Nữ
                        <form:option value="null"/>Khác
                    </div>
                </div>
            </div>
            <div class="col-4">
                <div class="row">
                    <div class="col-12">
                        <form:label path="country"/>Quốc tịc <span style="color: red">(*)</span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <form:select path="country"/>-- chọn --
                        <form:option value="VietNam"/>Việt Nam
                        <form:option value="American"/>Mỹ
                        <form:option value="England"/>Anh
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-12">
                <p>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác <span style="color: red">(*)</span></p>
            </div>
        </div>
        <div class="row">
            <div class="col-12">
                <form:input path="pastCode"/>
            </div>
        </div>
        <div class="row">
            <div class="col-12">
                <p>Thông tin đi lại <span style="color: red">(*)</span></p>
                <form:checkbox path="travel"/>Tàu bay
                <form:checkbox path="travel"/>Tàu Thuyền
                <form:checkbox path="travel"/>Ô tô
                <form:checkbox path="travel"/>Khác
            </div>
        </div>
        <div class="row">
            <div class="col-7">
                <div class="row">
                    <div class="col-12">
                        <form:label path="idTravel"/>Số hiệu phương tiện
                        <form:input path="idTravel"/>
                    </div>
                </div>
            </div>
            <div class="col-5">
                <div class="row">
                    <div class="col-12">
                        <form:label path="amountTravel"/>Số ghế
                        <form:input path="quantityTable"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <div class="row">
                    <div class="col-12">
                        <form:label path="dateStar"/>Ngày khởi hành <span style="color: red">(*)</span>
                        <form:input path="dateStart"/>
                    </div>
                </div>
            </div>
            <div class="col-6">
                <div class="row">
                    <div class="col-12">
                        <form:label path="dateEnd"/>Ngày kết thúc<span style="color: red">(*)</span>
                        <form:input path="dateEnd"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-12">
                <form:label path="describeTravel"/>Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh thành phố nào? <span
                    style="color: red">(*)</span>
                <form:input path="describeTravel"/>
            </div>
        </div>
        <div class="row">
            <div class="col-12">
                <form:label path="address"/>Địa chỉ liên lạc
                <form:input path="address"/>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <div class="row">
                    <div class="col-12">
                        <form:label path="phone"/>Điện thoại <span style="color: red">(*)</span>
                        <form:input path="phone"/>
                    </div>
                </div>
            </div>
            <div class="col-6">
                <div class="row">
                    <div class="col-12">
                        <form:label path="email"/>Địa chỉ<span style="color: red">(*)</span>
                        <form:input path="email"/>
                    </div>
                </div>
            </div>
        </div>
        <table class="talbe">
            <tr>
                <td>Triệu chứng</td>
                <td>Có</td>
                <td>Không</td>
                <td>Triệu chứng</td>
                <td>Có</td>
                <td>Không</td>
            </tr>
            <form:select path="indication"/>
            <tr>
                <td>
                    Sốt <span style="color: red">(*)</span>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
                <td>
                    Nôn/Buồn nôn <span style="color: red">(*)</span>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
            </tr>

            <tr>
                <td>
                    Ho <span style="color: red">(*)</span>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
                <td>
                    Tiêu chảy <span style="color: red">(*)</span>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
            </tr>

            <tr>
                <td>
                    Khó thở <span style="color: red">(*)</span>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
                <td>
                    Xuất huyết ngoài da <span style="color: red">(*)</span>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
            </tr>

            <tr>
                <td>
                    Đau họng <span style="color: red">(*)</span>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
                <td>
                    Nổi ban ngoài da <span style="color: red">(*)</span>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
                <td>
                    <form:radiobutton path="indication"/>
                </td>
            </tr>
        </table>
        <div class="row">
            <div class="col-12">
                <p>Lịch sử phơi nhiểm: Trong vòng 14 ngày qua, Anh/Chi có <span style="color: red">(*)</span></p>
            </div>
        </div>
        <table class="talbe">
            <tr>
                <td></td>
                <td>Có</td>
                <td>Không</td>
            </tr>
            <tr>
                <td>Đến trang trại chăn nuôi/ chợ buôn bán động vật sống/ cơ sở giết mỗ động vật/ tiếp xúc động vật
                    <span style="color: red">(*)</span>
                </td>
                <td>
                    <form:checkbox path="historyExposure"/>
                </td>
                <td>
                    <form:checkbox path="historyExposure"/>
                </td>
            </tr>
            <tr>
                <td>
                    Tiếp xúc gần (<2m) với người mắc bệnh việm đường hô ập do nCoV
                    <span style="color: red">(*)</span>
                </td>
                <td>
                    <form:checkbox path="historyExposure"/>
                </td>
                <td>
                    <form:checkbox path="historyExposure"/>
                </td>
            </tr>
        </table>
    </form:form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
