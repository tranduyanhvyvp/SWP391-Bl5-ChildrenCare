

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
        <link href="css/cart.css" rel="stylesheet" type="text/css"/>


    </head>
    <body>
        <jsp:include page="component/header.jsp"></jsp:include>

            <div class="content">

                <div id="main">

                    <div class="shopping-cart">

                        <div class="column-labels">
                            <label class="product-image">Image</label> <label
                                class="product-details">Service</label> <label
                                class="product-price">Price</label> <label
                                class="product-quantity">Quantity</label><label
                                class="product-line-price">Total</label>
                        </div>
                    <%
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
                        <div class="product-image">
                            <img src="images/<%=serviceDAO.getServicetById(c.getService().getId()).getThumbnail()%>">
                        </div>
                        <div class="product-details">
                            <div class="product-title">
                                <%=serviceDAO.getServicetById(c.getService().getId()).getTitle()%>
                            </div>
                            <p class="product-description"></p>
                        </div>
                        <div class="product-price"><%=nf.format(serviceDAO.getServicetById(c.getService().getId()).getSale_price())%>$

                        </div>
                        <div class="product-quantity cart_quantity_button">
                            <a class="cart_quantity_down" href="CartServlet?command=deleteCart&id=<%=c.getService().getId()%>"> - </a>
                            <input class="cart_quantity_input" type="number" value="<%=c.getQuantity()%>" disabled="disabled"/>
                            <a class="cart_quantity_up" href="CartServlet?command=addCart&id=<%=c.getService().getId()%>"> + </a>
                        </div>
                        <div class="product-line-price" style="text-align: right"><%=nf.format(serviceDAO.getServicetById(
                                    c.getService().getId()).getSale_price() * c.getQuantity())%>$


                            <a href="CartServlet?command=removeCart&id=<%=c.getService().getId()%>"><img style="margin-left: 10px" src="images/delete.png"></a>
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

                    <a class="checkout" href="reservation_details.jsp"  style="text-decoration: none;">Check Out</a>
                    <%} else { %>

                    <a class="checkout" href="ServicesServlet" style="text-decoration: none;">Services List</a>
                    <%}%>
                </div>







            </div>
        </div>
        <div>
            <jsp:include page="component/footer.jsp"></jsp:include>
        </div>







    </body>
</html>
