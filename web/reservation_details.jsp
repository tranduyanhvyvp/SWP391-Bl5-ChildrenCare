

<%@page import="model.Account"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Cart"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="dao.ServicesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Service Detail</title>
        <link rel="stylesheet" type="text/css" href="css/styleService.css">
        <link href="css/detail_service.css" rel="stylesheet" type="text/css"/>
        <link href="css/reservation_details.css" rel="stylesheet" type="text/css"/>


    </head>
    <body>
        <jsp:include page="component/header.jsp"></jsp:include>
            
            <div class="content">

                <div id="main">

                    <div class="shopping-cart">

                        <div class="column-labels">
                            <label
                                class="product-details">Title</label> <label
                                class="product-price">Price</label> <label
                                class="product-quantity">Quantity</label><label
                                class="product-line-price">Total Cost</label>
                        </div>
                    <%
                        Account account = (Account) session.getAttribute("account");
                        ServicesDAO serviceDAO = new ServicesDAO();

                        NumberFormat nf = NumberFormat.getInstance();
                        nf.setMinimumIntegerDigits(0);
                        double total = 0;
                        ArrayList<Cart> cart = null;
                        if (session.getAttribute("cart") != null) {
                            cart = (ArrayList<Cart>) session.getAttribute("cart");
                        }
                    %>
                    <%
                        if (cart != null) {
                            for (Cart c : cart) {
                                total = total + (c.getQuantity() * serviceDAO.getServicetById(c.getService().getId()).getSale_price());
                    %>
                    <div class="product">

                        <div class="product-details">
                            <div class="product-title">
                                <%=serviceDAO.getServicetById(c.getService().getId()).getTitle()%>
                            </div>
                            <p class="product-description"></p>
                        </div>
                        <div class="product-price"><%=nf.format(serviceDAO.getServicetById(c.getService().getId()).getSale_price())%>$

                        </div>
                        <div class="product-quantity cart_quantity_button">

                            <input class="cart_quantity_input" type="number" value="<%=c.getQuantity()%>" disabled="disabled"/>

                        </div>
                        <div class="product-line-price" style=""><%=nf.format(serviceDAO.getServicetById(
                                    c.getService().getId()).getSale_price() * c.getQuantity())%>$



                        </div>

                    </div>
                    <%
                            }
                        }
                    %>
                    <div class="totals">
                        <div class="totals-item">
                            <label>Total Bill</label>
                            <div class="totals-value" id="cart-subtotal"><%=nf.format(total)%>$

                            </div>
                        </div>
                    </div>
                    <%if (cart.size() > 0) { %>

                    <a class="checkout" onclick="history.back()" style="text-decoration: none;">Change</a>
                    <%}%>
                    <style>
                        

                        input[type=text], select, textarea {
                            width: 100%;
                            padding: 12px;
                            border: 1px solid #ccc;
                            border-radius: 4px;
                            box-sizing: border-box;
                            margin-top: 6px;
                            margin-bottom: 16px;
                            resize: vertical;
                        }

                        input[type=submit] {
                            background-color: #04AA6D;
                            color: white;
                            padding: 12px 20px;
                            border: none;
                            border-radius: 4px;
                            cursor: pointer;
                        }

                        input[type=submit]:hover {
                            background-color: #45a049;
                        }

                        .infoCustomer {
                            border-radius: 5px;
                            background-color: #f2f2f2;
                            padding: 20px;
                        }
                    </style>
                  

                        <h3>Contact Form</h3>

                        <div class="infoCustomer">
                           
                                <label for="fname">Full Name</label>
                                <input type="text" id="fname" value="<%=account.getFullName()%>" name="firstname" placeholder="Your name">
                                <label for="gender">Gender</label>
                                <select id="gender" name="gender">
                                    <option value="1">Male</option>
                                    <option value="0">Female</option>
                                </select>
                                <label for="email">Email</label>
                                <input type="text" id="email" value="<%=account.getEmail()%>" name="email" placeholder="Your email">
                                <label for="mobile">Mobile</label>
                                <input type="text" id="mobile" value="<%=account.getPhoneNumber()%>" name="mobile" placeholder="Your mobile">
                                <label for="address">Address</label>
                                <input type="text" id="address" value="<%=account.getAddress()%>" name="address" placeholder="Your address">
                                <label for="subject">Notes</label>
                                <textarea id="subject" name="subject" placeholder="Write something.." style="height:100px"></textarea>

                                <input type="submit" value="Submit">
                            
                        </div>
                </div>







            </div>
        </div>
        <div>
            <jsp:include page="component/footer.jsp"></jsp:include>
        </div>







    </body>
</html>
