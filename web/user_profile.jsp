
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<style type="text/css">
    body{
        background: #f7f7ff;
        margin-top:20px;
    }
    .card {
        position: relative;
        display: flex;
        flex-direction: column;
        min-width: 0;
        word-wrap: break-word;
        background-color: #fff;
        background-clip: border-box;
        border: 0 solid transparent;
        border-radius: .25rem;
        margin-bottom: 1.5rem;
        box-shadow: 0 2px 6px 0 rgb(218 218 253 / 65%), 0 2px 6px 0 rgb(206 206 238 / 54%);
    }
    .me-2 {
        margin-right: .5rem!important;
    }
</style>

<script type="text/javascript">

</script>

<html>

    <head>
        <title>Profile Page</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>profile edit data and skills - Bootdey.com</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>


        <jsp:include page="component/header.jsp"></jsp:include>

            <div class="content">
                <div class="container">
                    <div class="main-body">
                        <div class="row">
                            <div class="col-lg-4">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="d-flex flex-column align-items-center text-center">
                                            <img src="images/${acc.avatar}" alt="Admin" class="rounded-circle p-1 bg-primary" width="110">
                                        <div class="mt-3">
                                            <h4>${acc.fullName}</h4>
                                            <p class="text-muted font-size-sm">${acc.username}</p>
                                            <p class="text-muted font-size-sm">${acc.email}</p>
                                            <p class="text-muted font-size-sm">${acc.phoneNumber}</p>
                                            <p class="text-muted font-size-sm">${acc.dob}</p>
                                            <p class="text-muted font-size-sm">${acc.address}</p>
                                            <span class="psw"><a href="user_change_password.jsp">Change Password</a></span>
                                        </div>
                                    </div>
                                    <hr class="my-4">
                                    
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-8">
                            <div class="card">
                                <form action="UserProfileController" method="POST">
                                    <div class="card-body">
                                        <div class="row mb-3">
                                            <div class="col-sm-3">
                                                <h6 class="mb-0">Username</h6>
                                            </div>
                                            <div class="col-sm-9 text-secondary">
                                                <input type="text" class="form-control" name="username" value="${sessionScope.account.username}" readonly>
                                            </div>
                                        </div>
                                            <div class="row mb-3">
                                            <div class="col-sm-3">
                                                <h6 class="mb-0">Email</h6>
                                            </div>
                                            <div class="col-sm-9 text-secondary">
                                                <input type="text" class="form-control" name="email" value="${acc.email}" readonly>
                                            </div>
                                        </div>
                                        <div class="row mb-3">
                                            <div class="col-sm-3">
                                                <h6 class="mb-0">Full Name</h6>
                                            </div>
                                            <div class="col-sm-9 text-secondary">
                                                <input type="text" class="form-control" name="fullName" value="${acc.fullName}">
                                            </div>
                                        </div>
                                        
                                        <div class="row mb-3">
                                            <div class="col-sm-3">
                                                <h6 class="mb-0">Phone</h6>
                                            </div>
                                            <div class="col-sm-9 text-secondary">
                                                <input type="text" class="form-control" name="phoneNumber" value="${acc.phoneNumber}">
                                            </div>
                                        </div>
                                        <div class="row mb-3">
                                            <div class="col-sm-3">
                                                <h6 class="mb-0">Gender</h6>
                                            </div>
                                            <div class="col-sm-9 text-secondary">
                                                <select name="gender">
                                                    <option value="1" ${acc.gender == '1' ? 'selected' : ''}>Male</option>
                                                    <option value="0" ${acc.gender == '0' ? 'selected' : ''}>FeMale</option>                                                       
                                                </select>
                                            </div>
                                        </div>
                                        <div class="row mb-3">
                                            <div class="col-sm-3">
                                                <h6 class="mb-0">Date of birth</h6>
                                            </div>
                                            <div class="col-sm-9 text-secondary">
                                                <input type="text" class="form-control" name="dob" value="${acc.dob}">
                                            </div>
                                        </div>            
                                        <div class="row mb-3">
                                            <div class="col-sm-3">
                                                <h6 class="mb-0">Address</h6>
                                            </div>
                                            <div class="col-sm-9 text-secondary">
                                                <input type="text" class="form-control" name="address" value="${acc.address}">
                                            </div>
                                        </div>
                                        
                                            
                                        <div class="row mb-3">
                                            <div class="col-sm-3">
                                                <h6 class="mb-0">Avatar</h6>
                                            </div>
                                            <div class="col-sm-9 text-secondary">
                                                <input class="form-control" type="file" name="avatar" id="formFile">
<!--                                                <input class="form-control form-control-sm" id="formFileSm" type="file">-->
                                                <br>
                                            </div>
                                        </div>    
 
                                        <div class="row">
                                            <div class="col-sm-3"></div>
                                            <div class="col-sm-9 text-secondary">
<!--                                                <button type="submit" >Save Changes</button>-->
                                                <input type="submit" class="btn btn-primary px-4" value="Save Changes">
                                            </div>
                                        </div>
                                    </div>
                                </form>

                            </div>

                        </div>
                    </div>
                </div>
            </div>







            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>


        </div>
        <div id="footer">
            <div>
                <div> <span>Follow us</span> <a href="#" class="facebook">Facebook</a> <a href="#" class="subscribe">Subscribe</a> <a href="#" class="twitter">Twitter</a> <a href="#" class="flicker">Flickr</a> </div>
                <ul>
                    <li> <a href="#"><img src="images/playing-in-grass.gif" alt=""></a>
                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna.</p>
                        <a href="#" class="readmore">Read more</a> </li>
                    <li> <a href="#"><img src="images/baby-smiling.gif" alt=""></a>
                        <p>Sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud.</p>
                        <a href="#" class="readmore">Read more</a> </li>
                </ul>
            </div>
            <p class="footnote">Copyright &copy; 2012 <a href="#">School Name</a> All rights reserved | Website Template By <a target="_blank" href="http://www.freewebsitetemplates.com/">freewebsitetemplates.com</a></p>
        </div>
    </body>
</html>
