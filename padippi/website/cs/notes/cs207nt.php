<!DOCTYPE html>
<html lang="en">
<head>

<!--Adsense vish-->
<script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({
          google_ad_client: "ca-pub-7177713502553152",
          enable_page_level_ads: true
     });
</script> 

  <title> KTU CS207 full notes, module wise notes</title>
  <meta charset="utf-8">
  <meta name="description" content="padippi.com is a website which aims in helping all sort of students acheive good and better grades in their semester examinations. Designed, Developed and maintained by the interns of jyothi engineering college, padippi.com differ from other online sites by providing not only notes but also ppts, project assits, and project solutions for all students.">
  <meta name="keywords" content="cse, ktu cse, ktu cse full notes, questuion banks, previous year question paper solved, MA202 Notes, CS202 Notes, CS204 Notes, CS206 Notes, CS208 Notes, HS200 Notes,HS210 Notes, Full notes of all cse subjects">
  <link rel="stylesheet" href="../../../css/reset.css" type="text/css" media="all">
  <link rel="stylesheet" href="../../../css/style.css" type="text/css" media="all">
  <link rel="stylesheet" href="../../../css/styles.css" type="text/css" media="all">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
      <link href="https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800|Old+Standard+TT:400,400i,700" rel="stylesheet">
      <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
      <link rel="stylesheet" href="../../../../css/animate.css">
      <link rel="stylesheet" type="text/css" href="../../../../attributes/css/base.css">
      <link rel="stylesheet" type="text/css" href="../../../../attributes/css/styles.css">
      <link rel="stylesheet" type="text/css" href="../../../../attributes/css/custom.css">


  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous"><script type="text/javascript" src="js/jquery-1.4.2.min.js" ></script>
  <script type="text/javascript" src="../../../js/cufon-yui.js"></script>
  <script type="text/javascript" src="../../../js/cufon-replace.js"></script>
  <script type="text/javascript" src="../../../js/Myriad_Pro_300.font.js"></script>
  <script type="text/javascript" src="../../../js/Myriad_Pro_400.font.js"></script>
  <script type="text/javascript" src="../../../js/script.js"></script>
  <script src="https://code.jquery.com/jquery-2.2.3.min.js"></script>
  <script src="../../../js/jquery.marquee.js"></script>
  <script type="text/javascript" src="../../../bootstrap.min.js"></script>
  <script src="../../../js/jquery.npContextMenu.js"></script>



  <!--[if lt IE 7]>
  <link rel="stylesheet" href="css/ie6.css" type="text/css" media="screen">
  <script type="text/javascript" src="js/ie_png.js"></script>
  <script type="text/javascript">ie_png.fix('.png, footer, header nav ul li a, .nav-bg, .list li img');</script>
  <![endif]-->
  <!--[if lt IE 9]><script type="text/javascript" src="js/html5.js"></script><![endif]-->

   <!-- Global site tag (gtag.js) - Google Analytics -->
   <script async src="https://www.googletagmanager.com/gtag/js?id=UA-138054085-1"></script>
    <script>
        window.dataLayer = window.dataLayer || [];
        function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());

        gtag('config', 'UA-138054085-1');
    </script>
    <!-- Global site tag (gtag.js) - Google Analytics vish -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-141196284-1"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-141196284-1');
</script>


</head>
<body id="page5">


<?php

    //Start connection to the localhost server
    include "../../../../conn1.php"; 
    if(isset($_POST['fileuploadsubmit']))
    {
        $uname=$_POST['name'];
        $password=$_POST['link'];
        $type=$_GET['p2'];
        $name=$_GET['p1'];
        $sql = "INSERT INTO `s3cs207`(`name`, `link`, `type`, `Author`) VALUES ('$uname', '$password', '$type', '$name')";
        $qry = mysqli_query($conn, $sql);

    }
?>
<!-- START PAGE SOURCE -->
<div class="wrap">
  <header>
    <div class="conta">
    <a href="https://www.padippi.com"><img src="../../../images/logos.jpg" style="width: 64%;position:absolute;top: 64px;"></a>
      <nav>
        <ul>
        <li><a href="https://www.padippi.com" class="m1">Home Page</a></li>
          <li><a href="../../../../disclaimer.php" class="m2">Disclaimer</a></li>
          <li><a href="../../../../terms.php" class="m3">Terms and Conditions</a></li>
          <li><a href="../../../../contact.php" class="m4">Contact Us</a></li>
          <li class="last"><a href="../../../../about.php" class="m5">About Us</a></li>
        </ul>
      </nav>
      <form action="#" id="search-form">
        <fieldset>
          <div class="rowElem">
            <input type="text">
            <a href="#">Search</a></div>
        </fieldset>
      </form>
    </div>
  </header>
  <div class="conta">
    <aside>
      <h3>Universities</h3>
      <!-- <a class="active" href="index.php">Home</a>
            <a href="#">Services</a>
            <a href="disclaimer.php">Disclaimer</a>
            <a href="terms.php">Terms & Conditions</a>
            <a href="about.php">About Us</a>
            <a href="contact.php">Contact Us</a> -->
      <ul class="categories">
      <li><span><a href="../../../ktuindex.php">Kerala Technical University</a></span></li>
        <li><span><a href="../../../../DHSE/ktuindex.php">DHSE</a></span></li>
        <li><span><a href="../../../../UC/ktuindex.php">Calicut University</a></span></li>
        <!-- <li><span><a href="#">Descriptions</a></span></li>
        <li><span><a href="#">Administrators</a></span></li>
        <li><span><a href="#">Basic Information</a></span></li>
        <li><span><a href="#">Vacancies</a></span></li> -->
        <li class="last"><span><a href="#">MG university</a></span></li>
      </ul>
      <form action="#" id="newsletter-form" >
        <fieldset>
          <div class="rowElem">
            <h2>Newsletter</h2>
            <input type="email" value="Enter Your Email Here" onFocus="if(this.value=='Enter Your Email Here'){this.value=''}" onBlur="if(this.value==''){this.value='Enter Your Email Here'}" >
            <div class="clear"><a href="#" class="fleft">Unsubscribe</a><a href="#" class="fright">Submit</a></div>
          </div>
        </fieldset>
      </form>
      <?php
      include "../../../news.php";
      ?>
     <br><br>
<script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<!-- display_ad1 -->
<ins class="adsbygoogle"
style="display:block"
data-ad-client="ca-pub-7177713502553152"
data-ad-slot="1277652065"
data-ad-format="auto"
data-full-width-responsive="true"></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>
    </aside>




    <section id="content">
    <script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<!-- Display_ad2 -->
<ins class="adsbygoogle"
     style="display:block"
     data-ad-client="ca-pub-7177713502553152"
     data-ad-slot="8577557584"
     data-ad-format="auto"
     data-full-width-responsive="true"></ins>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({});
</script>
<br>  
      <div class="inside">
        <div class="address">
          <div class="logo">
            <img src="../../../../images/logo-ktu.png" alt="ktu university logo"  style="left: 44%;position: relative;">
            <h2 style="left: 18%;position: relative;">KERALA TECHNICAL UNIVERSITY </h2>
          </div>
          <div class="courses_01">
            <!-- courses -->
            <section>
              <div class="conta"><hr>
                <h2 class="dept"> Electronic Devices and Circuits  </h2>
                <div class="col">
                  <div class="container_pdtn">
                    <div class="headings">
                      CS207<hr>
                    </div>
                    <div class="question_bank">
                      <h2 >Study Notes</h2>
                    </div>
                    <?php
                            //Select all data from `updis` table
                    $select = "SELECT * FROM `s3cs207` WHERE type='notes' ORDER BY id DESC";
                    $query = mysqli_query($conn, $select) ;
                    while($row = mysqli_fetch_array($query)) 
                    {
                        $image = $row['link'];
                        $txt = $row['name'];
                        //echo $image;
                        //Display image from the database
                        
                        echo '<li class="list-group-item"><a href="frame1.php?p1='.$txt.'&p2='.$image.'" target="_blank">'.$txt.'</a>
                              <img src="../../../../images/new2.gif"style="width:50px;padding-left:20px;">
                              </li>';
                        //echo '<img src="images/'.$image.'" height="150" width="150" >';
                    }
        ?>
                    <?php
                      //close connection
                      if (mysqli_close($conn)) 
                      {
                          //echo "<br />Connection closed.........";
                      }
                    
                    ?>
        <!-- <div class="lecture_notes">
            <h2>Lectures Notes</h2>
        </div> -->
    <?php
                        //Select all data from `updis` table
               /* $select = "SELECT * FROM `s4pdtn` WHERE type='lectur'";
                $query = mysqli_query($conn, $select) ;
                while($row = mysqli_fetch_array($query)) 
                {
                    $image = $row['link'];
                    $txt = $row['name'];
                    //echo $image;
                    //Display image from the database
                    
                    echo '<li class="list-group-item"><a href="'.$image.'">'.$txt.'</a>
                            <img src="../../../images/new2.gif"style="width:50px;padding-left:20px;">
                        </li>';
                    //echo '<img src="images/'.$image.'" height="150" width="150" >';
                }
                //close connection
                if (mysqli_close($conn)) 
                {
                    //echo "<br />Connection closed.........";
                }*/
    ?>
     
                  </div>
                </div>
              </div>
            </section>
            <!-- Courses -->
          </div>
        </div>
      </div>
    </section>




  </div>
</div>
<footer>
  <div class="footerlink">
    <p class="lf">Copyright &copy; 2019 <a href="index.php">TechnoclubSolutions Pvt Ltd</a> - All Rights Reserved</p>
    <p class="rf">Design by <a href="http://www.templatemonster.com/">TemplateMonster</a></p>
    <div style="clear:both;"></div>
  </div>
</footer>
<script type="text/javascript"> Cufon.now(); </script>
<script>
    $('#demo').marquee({

    // enable the plugin
    enable : true,  //plug-in is enabled

    // scroll direction
    // 'vertical' or 'horizontal'
    direction: 'vertical',

    // children items
    itemSelecter : 'li', 

    // animation delay
    delay: 2000,

    // animation speed
    speed: 1,

    // animation timing
    timing: 1,

    // mouse hover to stop the scroller
    mouse: true

    }); 
</script>
<!-- END PAGE SOURCE -->


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <!-- Custom JavaScript -->
    <script src="../../js/animate.js"></script>
    <script src="../../js/custom.js"></script>
</body>
</html>
