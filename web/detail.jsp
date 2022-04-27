

<%@page import="entity.Account"%>

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



    </head>
    <body>
        <jsp:include page="component/header.jsp"></jsp:include>
                
                <div class="content">
                   
                <%
                    Account account = (Account) session.getAttribute("account");
                    String id = "";
                    if (request.getParameter("id") != null) {
                        id = request.getParameter("id");
                    }

                    ServicesDAO serviceDAO = new ServicesDAO();
                    NumberFormat nf = NumberFormat.getInstance();
                    nf.setMinimumFractionDigits(0);
                %>
                <div id="main">
                     <div class="baby"> <img src="images/baby.jpg" alt=""> </div>

                    

                        <div class="left-1">
                            <img
                                src="images/<%=serviceDAO.getServicetById(Integer.parseInt(id)).getThumbnail()%>"
                                width="200px" height="200px" />
                        </div>
                        <div class="left-2">
                            <table>
                                <tr class="row1">
                                    <td class="col2" colspan="2"
                                        style="padding: 10px; color: blue; font-size: 15px; text-transform: uppercase; text-align: center; font-weight: bold"><%=serviceDAO.getServicetById(Integer.parseInt(id)).getTitle()%></td>
                                </tr>
                                <tr class="row2">
                                    <td class="col1">Information:</td>
                                    <td class="col2"><%=serviceDAO.getServicetById(Integer.parseInt(id)).getDescription()%></td>
                                </tr>

                                <tr class="row2">
                                    <td class="col1">Sale Price:</td>
                                    <td class="col2"><%=nf.format(serviceDAO.getServicetById(Integer.parseInt(id)).getSale_price())%>$</td>
                                </tr>

                            </table>
                        </div>
                        <% if(account != null) { %>
                        <div
                            style="margin-left: auto; margin-right: auto; text-align: center; margin-top: 10px; padding: 10px; clear: both;">

                            <form action="CartController" method="post">
                                <input type="hidden" value="1" name="soluong"/>
                                <input type="hidden" value="setCart" name="command"/>
                                <input type="hidden" value="<%=id%>" name="id"/>
                                <input type="submit" value="Add to Cart" class="btn">
                            </form>	
                        </div>
                        <%} else { %>
                        <div
                            style="margin-left: auto; margin-right: auto; text-align: center; margin-top: 10px; padding: 10px; clear: both;">

                            <form action="login.jsp" method="post">
                                
                                <input type="submit" value="Add to Cart" class="btn">
                            </form>	
                        </div>
			<%} %>
			


                   
                </div>
            </div>
       
        <div>
            <jsp:include page="component/footer.jsp"></jsp:include>
        </div>





    </body>
</html>
