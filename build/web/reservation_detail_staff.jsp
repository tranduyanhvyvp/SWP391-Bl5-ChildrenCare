<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : user_detail
    Created on : Apr 20, 2022, 12:22:40 AM
    Author     : aDMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <!--  This file has been downloaded from bootdey.com @bootdey on twitter -->
        <!--  All snippets are MIT license http://bootdey.com/license -->
        <title>profile with data and skills - Bootdey.com</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="main-body">

                <!-- Breadcrumb -->
                <nav aria-label="breadcrumb" class="main-breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="/SWP391-Bl5-ChildrenCare/HomePageController">Home</a></li>
                        <li class="breadcrumb-item"><a href="/SWP391-Bl5-ChildrenCare/reservationlist">Reservation List</a></li>
                        <li class="breadcrumb-item active" aria-current="page">Reservation Detail</li>
                    </ol>
                </nav>
                <!-- /Breadcrumb -->

                <div class="row gutters-sm">

                    <div class="col-md-12">
                        <div class="card mb-3">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-sm-3">
                                        <h6 class="mb-0">ID</h6>
                                    </div>
                                    <div class="col-sm-9 text-secondary">
                                        ${reservation.id}
                                    </div>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <h6 class="mb-0">Customer Name</h6>
                                    </div>
                                    <div class="col-sm-9 text-secondary">
                                        ${reservation.customer.fullname}
                                    </div>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <h6 class="mb-0">Email</h6>
                                    </div>
                                    <div class="col-sm-9 text-secondary">
                                        ${reservation.customer.emaii}
                                    </div>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <h6 class="mb-0">Phone</h6>
                                    </div>
                                    <div class="col-sm-9 text-secondary">
                                        ${reservation.customer.phoneNumber}
                                    </div>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <h6 class="mb-0">Date</h6>
                                    </div>
                                    <div class="col-sm-9 text-secondary">
                                        ${reservation.date}
                                    </div>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <h6 class="mb-0">Service</h6>
                                    </div>
                                    <div class="col-sm-9 text-secondary" ><a href="/SWP391-Bl5-ChildrenCare/detail.jsp?id=${reservation.service.id}">
                                            ${reservation.service.title}
                                        </a>
                                    </div>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <h6 class="mb-0">Total</h6>
                                    </div>
                                    <div class="col-sm-9 text-secondary">
                                        ${reservation.total}
                                    </div>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-sm-3">
                                        <h6 class="mb-0">Status</h6>
                                    </div>
                                    <div class="col-sm-9 text-secondary">
                                        <c:if test="${sessionScope.account.role_id==3}">
                                            ${reservation.status.name}
                                        </c:if>
                                        <c:if test="${sessionScope.account.role_id==2}">
                                            <select onchange="myFunction(${reservation.id}, this.value)">
                                                <c:forEach var="o" items="${listStatus}">
                                                    <option value="${o.id}" ${reservation.status.id==o.id ? "selected":""}>${o.name}</option>
                                                </c:forEach>
                                            </select>
                                        </c:if>
                                    </div>
                                </div>
                                <hr>
                                <c:if test="${sessionScope.account.role_id==2}">
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h6 class="mb-0">Staff</h6>
                                        </div>
                                        <div class="col-sm-9 text-secondary">

                                            <select onchange="myFunction1(${reservation.id}, this.value)">
                                                <c:forEach var="o" items="${listStaff}">
                                                    <option value="${o.id}" ${reservation.staff_id==o.id ? "selected":""}>${o.fullname}</option>
                                                </c:forEach>
                                            </select>

                                        </div>
                                    </div>
                                    <hr>
                                </c:if>


                            </div>
                        </div>





                    </div>
                </div>

            </div>
        </div>

        <style type="text/css">
            body{
                margin-top:20px;
                color: #1a202c;
                text-align: left;
                background-color: #e2e8f0;    
            }
            .main-body {
                padding: 15px;
            }
            .card {
                box-shadow: 0 1px 3px 0 rgba(0,0,0,.1), 0 1px 2px 0 rgba(0,0,0,.06);
            }

            .card {
                position: relative;
                display: flex;
                flex-direction: column;
                min-width: 0;
                word-wrap: break-word;
                background-color: #fff;
                background-clip: border-box;
                border: 0 solid rgba(0,0,0,.125);
                border-radius: .25rem;
            }

            .card-body {
                flex: 1 1 auto;
                min-height: 1px;
                padding: 1rem;
            }

            .gutters-sm {
                margin-right: -8px;
                margin-left: -8px;
            }

            .gutters-sm>.col, .gutters-sm>[class*=col-] {
                padding-right: 8px;
                padding-left: 8px;
            }
            .mb-3, .my-3 {
                margin-bottom: 1rem!important;
            }

            .bg-gray-300 {
                background-color: #e2e8f0;
            }
            .h-100 {
                height: 100%!important;
            }
            .shadow-none {
                box-shadow: none!important;
            }

        </style>

        <script type="text/javascript">

        </script>
        <script>
            function myFunction(reservationid, statusid) {
                $.ajax({
                    url: "/SWP391-Bl5-ChildrenCare/updatestatusreservation",
                    type: "get", //send it through get method
                    data: {
                        rsid: reservationid,
                        stid: statusid
                    },
                    success: function (data) {

                    },
                    error: function (xhr) {
                        //Do Something to handle error
                    }
                });
            }
        </script>
        <script>
            function myFunction1(reservationid, staff_id) {
                $.ajax({
                    url: "/SWP391-Bl5-ChildrenCare/updatestatusreservation",
                    type: "post", //send it through get method
                    data: {
                        rsid: reservationid,
                        stid: staff_id
                    },
                    success: function (data) {

                    },
                    error: function (xhr) {
                        //Do Something to handle error
                    }
                });
            }
        </script>
    </body>
</html>