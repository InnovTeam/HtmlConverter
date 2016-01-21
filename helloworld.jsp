<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html lang="en">
 <head>       
  <title>Renter Maintenance</title> 
  <!-- Bootstrap core CSS -->   
  <!-- Custom styles for this template -->    
  <!-- Just for debugging purposes. Don't actually copy these 2 lines! --> 
  <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]--> 
  <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]--> 
 </head> 
 <body> 
  <!--top navigation section start--> 
  <header class="navbar navbar-fixed-top"> 
   <nav class="container-fluid navbar-inverse"> 
    <div class="topmenu-holder"> 
     <div class="container-fluid"> 
      <div id="navbar" class="collapse top-nav"> 
       <ul class="nav navbar-nav"> 
        <li class="active"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Renter Profile<span class="caret"></span></a> 
         <ul class="dropdown-menu" role="menu"> 
          <li><a href="#">Maintain Renter</a></li> 
          <li><a href="#">Create Renter</a></li> 
          <li><a href="#">Loyalty Profile Merge</a></li> 
         </ul> </li> 
        <li><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Loyalty Program<span class="caret"></span></a> 
         <ul class="dropdown-menu" role="menu"> 
          <li><a href="#">Loyalty Tiers</a></li> 
          <li><a href="#">Loyalty Source Codes</a></li> 
          <li><a href="#">Loyalty Communications</a></li> 
         </ul> </li> 
        <li><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Account<span class="caret"></span></a> 
         <ul class="dropdown-menu" role="menu"> 
          <li><a href="#">Customer Account Information</a></li> 
         </ul> </li> 
       </ul> 
      </div> 
     </div> 
    </div> 
    <div class="user-details"> 
     <ul class="nav navbar-nav"> 
      <li><a>E576HD</a></li> 
      <li><a>MCTT01</a></li> 
      <li><a>10:26:22</a></li> 
     </ul> 
    </div> 
    <div class="navbar-header"> 
     <button type="button" class="navbar-toggle collapsed" id="top" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button> 
    </div> 
    <div class="user-details-icon"> 
     <button type="button" class="btn btn-default btn-lg user-icon" data-toggle="collapse"> <span class="glyphicon glyphicon-user" aria-hidden="true"></span> </button> 
    </div> 
    <div class="user-details-small no-display"> 
     <ul class="nav navbar-nav"> 
      <li><a>E576HD</a></li> 
      <li><a>MCTT01</a></li> 
      <li><a>10:26:22</a></li> 
     </ul> 
    </div> 
   </nav> 
  </header> 
  <!--top navigation section end--> 
  <!--page middle section start--> 
  <div class="container-fluid page-type-two-column "> 
   <!--breadcrumb section start--> 
   <ol class="breadcrumb"> 
    <li>Renter Profile</li> 
    <li><a href="#">Maintain Renter</a></li> 
    <li class="active">Identification</li> 
   </ol> 
   <!--breadcrumb section end--> 
   <!--page heading and left menu section start--> 
   <section class="row"> 
    <div class="page-header clearfix"> 
     <!--page heading section start--> 
     <div class="col-xs-12 col-sm-12 col-md-4 col-lg-6"> 
      <h1 class="pull-left page-title-toggle">Identification</h1> 
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar" aria-controls="sidebar">Identification</button> 
     </div> 
     <!--page heading section end--> 
     <!--left sidebar section start--> 
     <div class="sidebar collapse left-navbar-collapse" id="sidebar"> 
      <ul class="nav nav-sidebar"> 
       <li class="active"> <button type="button" class="btn btn-default" id="leftIdentification"><span class="badge badgeblue">F2</span> Identification</button> </li> 
       <li> <button type="button" class="btn btn-default" id="leftCommunications"><span class="badge">F3</span> Communications</button> </li> 
       <li> <button type="button" class="btn btn-default" id="lefTravelProgramsPayments"><span class="badge">F4</span> Travel Programs &amp; Payments</button> </li> 
       <li> <button type="button" class="btn btn-default" id="leftLoyaltyPrograms"><span class="badge">F5</span> Loyalty Programs</button> </li> 
       <li> <button type="button" class="btn btn-default" id="leftLoyaltySelections"><span class="badge">F6</span> Loyalty Selections</button> </li> 
       <li> <button type="button" class="btn btn-default" id="leftLoyaltyRewards"><span class="badge">F7</span> Loyalty Rewards</button> </li> 
       <li> <button type="button" class="btn btn-default" id="leftRentalHistory"><span class="badge">F8</span> Rental History</button> </li> 
      </ul> 
     </div> 
     <!--left sidebar section end--> 
     <div class="col-xs-12 col-sm-12 col-md-8 col-lg-6 hidden-xs"> 
      <div class="header-right-section"> 
       <ul> 
        <li> <button class="btn btn-utility" type="button"> <span class="badge">F1</span> Help </button> </li> 
        <li class="not-for-edit"> <button type="submit" class="btn btn-default"><span class="txt-underline">N</span>ew Search</button> </li> 
        <li class="not-for-edit"> <button type="submit" class="btn btn-default"><span class="txt-underline">L</span>ost Card</button> </li> 
        <li class="not-for-edit"> <button type="submit" class="btn btn-default">Repac<span class="txt-underline">k</span>age</button> </li> 
       </ul> 
      </div> 
     </div> 
     <!--for mobile--> 
     <div class="col-xs-12 col-sm-12 col-md-6 visible-xs"> 
      <div class="header-right-section action-right-section"> 
       <ul> 
        <li> <button class="btn btn-utility" type="button"> <span class="badge">F1</span> Help </button> </li> 
        <div class="navbar-header not-for-edit"> 
         <div class="navbar-toggle collapsed" id="action-btn" data-toggle="collapse" data-target="#action-navbar" aria-expanded="false" aria-controls="sidebar"> 
          <span>Actions</span> 
         </div> 
        </div> 
        <div class="action-sidebar collapse left-navbar-collapse not-for-edit" id="action-navbar"> 
         <ul class="nav nav-sidebar"> 
          <li> <button type="button" class="btn btn-default"><span class="badge badgeblue">F2</span> New Search</button> </li> 
          <li class="active"> <button type="button" class="btn btn-default"><span class="badge">F3</span> Lost Card</button> </li> 
          <li> <button type="button" class="btn btn-default"><span class="badge">F4</span> Repackage </button> </li> 
         </ul> 
        </div> 
       </ul> 
      </div> 
     </div> 
     <!--for mobile--> 
    </div> 
   </section> 
   <!--page heading and left menu section end--> 
   <!--page body content section start--> 
   <section class="row"> 
    <div class="page-header clearfix"> 
     <div class="col-xs-8 col-sm-10 col-md-10"> 
      <h3 class="profile-title">Profile Summary - <span>Jonathan Williams</span></h3> 
      <span class="profile-details-txt">Emerald Club Executive 987654321</span> 
     </div> 
     <div class="col-xs-4 col-sm-2 col-md-2"> 
      <a id="openProfileDetails" data-searchlinktext="Show Details" class="show-hide-text">Show Details</a> 
     </div> 
     <div class="no-display profileDetailsHolder"> 
      <div class="col-xs-12 col-sm-4 col-md-3"> 
       <p>Driver ID: 12345678</p> 
       <p class="red-txt">Do Not Rent</p> 
      </div> 
      <div class="col-xs-12 col-sm-4 col-md-4 padding-left-remove"> 
       <p>testrenterm@hotmail.com</p> 
       <p>VISA ************4321</p> 
      </div> 
      <div class="col-xs-12 col-sm-4 col-md-4"> 
       <p>Relationship: --</p> 
       <p>Parent ID: --</p> 
      </div> 
     </div> 
    </div> 
   </section> 
   <div class="row form-Hldr"> 
    <form method="post" id="identification" role="form" class="form-horizontal clearfix"> 
     <section class="clearfix" id="identificationRenter"> 
      <div> 
       <div class="col-xs-8 col-sm-9 col-md-9 col-lg-9"> 
        <h3 class="form-title header-with-button">Renter</h3> 
       </div> 
       <div class="col-xs-4 col-sm-3 col-md-3 col-lg-9 sectionHeader-right-section"> 
        <ul> 
         <li> <button id="renterSectionEdit" type="button" class="btn sec-edit-btn"> <span class="btn-edit" aria-hidden="true"></span> <span class="txt-underline">E</span>dit </button> </li> 
         <li> <button class="btn btn-small" type="button">Unmask</button> </li> 
        </ul> 
       </div> 
      </div> 
      <div class="col-xs-12 col-sm-12 col-md-12"> 
       <div class="col-xs-6 col-sm-1 col-md-1 col-lg-1"> 
        <div class="form-group"> 
         <s:text name="identification.label.title" />  
         <div class="input-padding-sm input-padding-xs" id="titleDiv"> 
          <s:select list="@com.convert.model.select.TitleType@getTitleType()" headerkey="" headervalue="" name="identification.title" value="" cssclass="form-control input-sm" id="title" /> 
         </div> 
        </div> 
       </div> 
       <div class="col-xs-12 col-sm-5 col-md-5 col-lg-4"> 
        <div class="form-group"> 
         <s:text name="identification.label.firstName" />  
         <div class="input-padding-sm input-padding-xs"> 
          <s:textfield name="firstName" value="" id="firstName" cssclass="form-control input-sm" /> 
         </div> 
        </div> 
       </div> 
       <div class="col-xs-12 col-sm-5 col-md-5 col-lg-5"> 
        <div class="form-group"> 
         <s:text name="identification.label.lastName" />  
         <div class="input-padding-sm input-padding-xs"> 
          <s:textfield name="lastName" value="" id="lastName" cssclass="form-control input-sm" /> 
         </div> 
        </div> 
       </div> 
       <div class="col-xs-6 col-sm-1 col-md-1 col-lg-1"> 
        <div class="form-group"> 
         <s:text name="identification.label.suffix" />  
         <div class="input-padding-sm input-padding-xs"> 
          <s:textfield name="suffix" value="" id="suffix" cssclass="form-control input-sm" /> 
         </div> 
        </div> 
       </div> 
      </div> 
      <div class="col-xs-12 col-sm-12 col-md-12"> 
       <div class="col-xs-6 col-sm-2 col-md-2 col-lg-2"> 
        <div class="form-group"> 
         <s:text name="identification.label.gender" />  
         <div class="input-padding-sm input-padding-xs input-padding-gap-xs"> 
          <s:select list="@com.convert.model.select.GenderType@getGenderType()" headerkey="" headervalue="" name="identification.gender" value="" cssclass="form-control input-sm" id="gender" /> 
         </div> 
        </div> 
       </div> 
       <div class=" col-xs-6 col-sm-3 col-md-3 col-lg-2"> 
        <div class="form-group"> 
         <s:text name="identification.label.dateOfBirth" />  
         <div class="input-padding-sm input-padding-xs"> 
          <s:textfield name="dateOfBirth" value="" id="dateOfBirth" cssclass="form-control input-sm" /> 
         </div> 
        </div> 
       </div> 
       <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
        <div class="form-group"> 
         <s:text name="identification.label.cityOfBirth" />  
         <div class="input-padding-sm input-padding-xs"> 
          <s:textfield name="cityOfBirth" value="" id="cityOfBirth" cssclass="form-control input-sm" /> 
         </div> 
        </div> 
       </div> 
      </div> 
     </section> 
     <section class="clearfix sec-lvl-btn no-display"> 
      <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 cancel-continuebtn btnRight "> 
       <div class="button-sec term-btn-holder"> 
        <div class="panel-middle"> 
         <input type="button" value="Save" id="btncontinue" class="btn btn-primary"> 
        </div> 
        <div class="panel-left"> 
         <input type="button" value="Cancel" id="cancelBtn" class="btn btn-secondary" data-toggle="modal" data-target="#editcreate-popup"> 
        </div> 
       </div> 
      </div> 
     </section> 
     <hr class="section-divider"> 
     <section class="clearfix drivers-license" id="identificationDriversLicense"> 
      <div> 
       <div class="col-xs-8 col-sm-9 col-md-9 col-lg-9"> 
        <h3 class="form-title header-with-button">Driver's License</h3> 
       </div> 
       <div class="col-xs-4 col-sm-3 col-md-3 col-lg-3 sectionHeader-right-section"> 
        <ul> 
         <li> <button id="dlSectionEdit" type="button" class="btn sec-edit-btn"> <span class="btn-edit" aria-hidden="true"></span> <span class="txt-underline">E</span>dit </button> </li> 
         <li> <button class="btn btn-small" type="button">Unmask</button> </li> 
        </ul> 
       </div> 
      </div> 
      <div class="beforeEdit"> 
       <div class="col-xs-12 col-sm-12 col-md-12"> 
        <div class="col-xs-12 col-sm-4 col-md-4 col-lg-3"> 
         <div class="form-group"> 
          <s:text name="identification.label.licenseNumber" />  
          <div class="input-padding-sm input-padding-xs"> 
           <s:textfield name="licenseNumber" value="" id="licenseNumber" cssclass="form-control input-sm" /> 
          </div> 
         </div> 
        </div> 
        <div class="col-xs-6 col-sm-3 col-md-3 col-lg-2"> 
         <div class="form-group"> 
          <s:text name="identification.label.issueDateDl" />  
          <div class="input-padding-sm input-padding-xs input-padding-gap-xs"> 
           <s:textfield name="issueDateDl" value="" id="issueDateDl" cssclass="form-control input-sm" /> 
          </div> 
         </div> 
        </div> 
        <div class="col-xs-6 col-sm-3 col-md-3 col-lg-2"> 
         <div class="form-group"> 
          <s:text name="identification.label.expirationDateDl" />  
          <div class="input-padding-sm input-padding-xs"> 
           <s:textfield name="expirationDateDl" value="" id="expirationDateDl" cssclass="form-control input-sm" /> 
          </div> 
         </div> 
        </div> 
       </div> 
       <div class="col-xs-12 col-sm-12 col-md-12"> 
        <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
         <div class="form-group"> 
          <s:text name="identification.label.issuingCountryDl" />  
          <div class="input-padding-sm input-padding-xs"> 
           <s:select list="@com.convert.model.select.IssuingCountryDlType@getIssuingCountryDlType()" headerkey="" headervalue="" name="identification.issuingCountryDl" value="" cssclass="form-control input-sm" id="issuingCountryDl" /> 
          </div> 
         </div> 
        </div> 
        <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
         <div class="form-group"> 
          <s:text name="identification.label.issuingStateDl" />  
          <div class="input-padding-sm input-padding-xs"> 
           <s:select list="@com.convert.model.select.IssuingStateDlType@getIssuingStateDlType()" headerkey="" headervalue="" name="identification.issuingStateDl" value="" cssclass="form-control input-sm" id="issuingStateDl" /> 
          </div> 
         </div> 
        </div> 
        <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
         <div class="form-group"> 
          <s:text name="identification.label.issuingCityDl" />  
          <div class="input-padding-sm input-padding-xs"> 
           <s:textfield name="issuingCityDl" value="" id="issuingCityDl" cssclass="form-control input-sm" /> 
          </div> 
         </div> 
        </div> 
       </div> 
      </div> 
      <div class="base-holder clearfix no-display"> 
       <div class="clearfix"> 
        <div class="col-xs-12 col-sm-12 col-md-12"> 
         <div class="col-xs-12 col-sm-4 col-md-4 col-lg-3"> 
          <div class="form-group"> 
           <s:text name="identification.label.licenseNumber" />  
           <div class="input-padding-sm input-padding-xs"> 
            <s:textfield name="licenseNumber" value="" id="licenseNumber" cssclass="form-control input-sm" /> 
           </div> 
          </div> 
         </div> 
         <div class="col-xs-6 col-sm-3 col-md-3 col-lg-2"> 
          <div class="form-group"> 
           <s:text name="identification.label.datepicker" />  
           <div class="input-padding-sm input-padding-xs input-padding-gap-xs"> 
            <s:textfield name="" value="" id="" cssclass="form-control input-sm datepicker" /> 
           </div> 
          </div> 
         </div> 
         <div class="col-xs-6 col-sm-3 col-md-3 col-lg-2"> 
          <div class="form-group"> 
           <s:text name="identification.label.expirationDateDl" />  
           <div class="input-padding-sm input-padding-xs"> 
            <s:textfield name="expirationDateDl" value="" id="expirationDateDl" cssclass="form-control input-sm datepicker" /> 
           </div> 
          </div> 
         </div> 
        </div> 
        <div class="col-xs-12 col-sm-12 col-md-12"> 
         <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
          <div class="form-group"> 
           <s:text name="identification.label.issuingCountryDl" />  
           <div class="input-padding-sm input-padding-xs"> 
            <s:select list="@com.convert.model.select.IssuingCountryDlType@getIssuingCountryDlType()" headerkey="" headervalue="" name="identification.issuingCountryDl" value="" cssclass="form-control input-sm" id="issuingCountryDl" /> 
           </div> 
          </div> 
         </div> 
         <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
          <div class="form-group"> 
           <s:text name="identification.label.issuingStateDl" />  
           <div class="input-padding-sm input-padding-xs"> 
            <s:select list="@com.convert.model.select.IssuingStateDlType@getIssuingStateDlType()" headerkey="" headervalue="" name="identification.issuingStateDl" value="" cssclass="form-control input-sm" id="issuingStateDl" /> 
           </div> 
          </div> 
         </div> 
         <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
          <div class="form-group"> 
           <s:text name="identification.label.issuingCityDl" />  
           <div class="input-padding-sm input-padding-xs"> 
            <s:textfield name="issuingCityDl" value="" id="issuingCityDl" cssclass="form-control input-sm" /> 
           </div> 
          </div> 
         </div> 
        </div> 
        <div class="col-xs-10 col-sm-8 col-md-12"> 
         <div class="remove-add-btn-holder"> 
          <div class="input-padding-sm input-padding-xs"> 
           <button class="btn clear-btn " type="button">Remove</button> 
          </div> 
         </div> 
         <div class="remove-add-btn-holder"> 
          <div class="input-padding-sm input-padding-xs"> 
           <button class="btn add-another clone-btn" type="button">Add Another</button> 
          </div> 
         </div> 
        </div> 
       </div> 
       <hr class="item-divider"> 
      </div> 
     </section> 
     <section class="clearfix sec-lvl-btn no-display"> 
      <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 cancel-continuebtn btnRight "> 
       <div class="button-sec term-btn-holder"> 
        <div class="panel-middle"> 
         <input type="button" value="Save" id="btncontinue" class="btn btn-primary"> 
        </div> 
        <div class="panel-left"> 
         <input type="button" value="Cancel" id="cancelBtn" class="btn btn-secondary" data-toggle="modal" data-target="#editcreate-popup"> 
        </div> 
       </div> 
      </div> 
     </section> 
     <hr class="create section-divider"> 
     <!--All fields are blank- Remove button displaying --> 
     <section class="clearfix legal-identities" id="identificationLegalIdsSection"> 
      <div> 
       <div class="col-xs-8 col-sm-9 col-md-9 col-lg-9"> 
        <h3 class="form-title header-with-button">Legal Identification</h3> 
       </div> 
       <div class="col-xs-4 col-sm-3 col-md-3 col-lg-3 sectionHeader-right-section"> 
        <ul> 
         <li> <button id="legalIdentificationSectionEdit" type="button" class="btn sec-edit-btn"> <span class="btn-edit" aria-hidden="true"></span> <span class="txt-underline">E</span>dit </button> </li> 
         <li> <button class="btn btn-small" type="button">Unmask</button> </li> 
        </ul> 
       </div> 
      </div> 
      <div class="beforeEdit"> 
       <div class="col-xs-12 col-sm-12 col-md-12"> 
        <div class="col-xs-12 col-sm-3 col-md-3 col-lg-3"> 
         <div class="form-group"> 
          <s:text name="identification.label.IdType" />  
          <div class="input-padding-sm input-padding-xs"> 
           <s:select list="@com.convert.model.select.IdTypeType@getIdTypeType()" headerkey="" headervalue="" name="identification.IdType" value="" cssclass="form-control input-sm" id="IdType" /> 
          </div> 
         </div> 
        </div> 
        <div class="col-xs-12 col-sm-3 col-md-3 col-lg-2"> 
         <div class="form-group"> 
          <s:text name="identification.label.IdNumber" />  
          <div class="input-padding-sm input-padding-xs"> 
           <s:textfield name="IdNumber" value="" id="IdNumber" cssclass="form-control input-sm" /> 
          </div> 
         </div> 
        </div> 
        <div class="col-xs-6 col-sm-3 col-md-3 col-lg-2"> 
         <div class="form-group"> 
          <s:text name="identification.label.issueDateLegal" />  
          <div class="input-padding-sm input-padding-xs input-padding-gap-xs"> 
           <s:textfield name="issueDateLegal" value="" id="issueDateLegal" cssclass="form-control input-sm" /> 
          </div> 
         </div> 
        </div> 
        <div class=" col-xs-6 col-sm-3 col-md-3 col-lg-2"> 
         <div class="form-group"> 
          <s:text name="identification.label.expirationDateLegal" />  
          <div class="input-padding-sm input-padding-xs"> 
           <s:textfield name="expirationDateLegal" value="" id="expirationDateLegal" cssclass="form-control input-sm" /> 
          </div> 
         </div> 
        </div> 
       </div> 
       <div class="col-xs-12 col-sm-12 col-md-12"> 
        <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
         <div class="form-group"> 
          <s:text name="identification.label.issuingCountryLegal" />  
          <div class="input-padding-sm input-padding-xs"> 
           <s:select list="@com.convert.model.select.IssuingCountryLegalType@getIssuingCountryLegalType()" headerkey="" headervalue="" name="identification.issuingCountryLegal" value="" cssclass="form-control input-sm" id="issuingCountryLegal" /> 
          </div> 
         </div> 
        </div> 
        <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
         <div class="form-group"> 
          <s:text name="identification.label.issuingStateLegal" />  
          <div class="input-padding-sm input-padding-xs"> 
           <s:select list="@com.convert.model.select.IssuingStateLegalType@getIssuingStateLegalType()" headerkey="" headervalue="" name="identification.issuingStateLegal" value="" cssclass="form-control input-sm" id="issuingStateLegal" /> 
          </div> 
         </div> 
        </div> 
        <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
         <div class="form-group"> 
          <s:text name="identification.label.issuingCityLegal" />  
          <div class="input-padding-sm input-padding-xs"> 
           <s:textfield name="issuingCityLegal" value="" id="issuingCityLegal" cssclass="form-control input-sm" /> 
          </div> 
         </div> 
        </div> 
       </div> 
      </div> 
      <div class="base-holder clearfix no-display"> 
       <div class="clearfix"> 
        <div class="col-xs-12 col-sm-12 col-md-12"> 
         <div class="col-xs-12 col-sm-3 col-md-3 col-lg-3"> 
          <div class="form-group"> 
           <s:text name="identification.label.IdType" />  
           <div class="input-padding-sm input-padding-xs"> 
            <s:select list="@com.convert.model.select.IdTypeType@getIdTypeType()" headerkey="" headervalue="" name="identification.IdType" value="" cssclass="form-control input-sm" id="IdType" /> 
           </div> 
          </div> 
         </div> 
         <div class="col-xs-12 col-sm-3 col-md-3 col-lg-2"> 
          <div class="form-group"> 
           <s:text name="identification.label.IdNumber" />  
           <div class="input-padding-sm input-padding-xs"> 
            <s:textfield name="IdNumber" value="" id="IdNumber" cssclass="form-control input-sm" /> 
           </div> 
          </div> 
         </div> 
         <div class="col-xs-6 col-sm-3 col-md-3 col-lg-2"> 
          <div class="form-group"> 
           <s:text name="identification.label.issueDateLegal" />  
           <div class="input-padding-sm input-padding-xs input-padding-gap-xs"> 
            <s:textfield name="issueDateLegal" value="" id="issueDateLegal" cssclass="form-control input-sm datepicker" /> 
           </div> 
          </div> 
         </div> 
         <div class=" col-xs-6 col-sm-3 col-md-3 col-lg-2"> 
          <div class="form-group"> 
           <s:text name="identification.label.expirationDateLegal" />  
           <div class="input-padding-sm input-padding-xs"> 
            <s:textfield name="expirationDateLegal" value="" id="expirationDateLegal" cssclass="form-control input-sm datepicker" /> 
           </div> 
          </div> 
         </div> 
        </div> 
        <div class="col-xs-12 col-sm-12 col-md-12"> 
         <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
          <div class="form-group"> 
           <s:text name="identification.label.issuingCountryLegal" />  
           <div class="input-padding-sm input-padding-xs"> 
            <s:select list="@com.convert.model.select.IssuingCountryLegalType@getIssuingCountryLegalType()" headerkey="" headervalue="" name="identification.issuingCountryLegal" value="" cssclass="form-control input-sm" id="issuingCountryLegal" /> 
           </div> 
          </div> 
         </div> 
         <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
          <div class="form-group"> 
           <s:text name="identification.label.issuingStateLegal" />  
           <div class="input-padding-sm input-padding-xs"> 
            <s:select list="@com.convert.model.select.IssuingStateLegalType@getIssuingStateLegalType()" headerkey="" headervalue="" name="identification.issuingStateLegal" value="" cssclass="form-control input-sm" id="issuingStateLegal" /> 
           </div> 
          </div> 
         </div> 
         <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4"> 
          <div class="form-group"> 
           <s:text name="identification.label.issuingCityLegal" />  
           <div class="input-padding-sm input-padding-xs"> 
            <s:textfield name="issuingCityLegal" value="" id="issuingCityLegal" cssclass="form-control input-sm" /> 
           </div> 
          </div> 
         </div> 
        </div> 
        <div class="col-xs-10 col-sm-8 col-md-12"> 
         <div class="delete-add-btn-holder custom-responsive-table chkBox-radio-elements no-display"> 
          <span> <span class="input others-input"> 
            <s:textfield name="mycheckbox3" value="" id="mycheckbox3" cssclass="" /> 
            <s:textfield name="" value="" id="" cssclass="" /> 
            <s:text name="identification.label.mycheckbox3" />  </span> </span> 
         </div> 
         <div class="remove-add-btn-holder remove-btn"> 
          <div class="input-padding-sm input-padding-xs"> 
           <button class="btn clear-btn " type="button">Remove</button> 
          </div> 
         </div> 
         <div class="remove-add-btn-holder"> 
          <div class="input-padding-sm input-padding-xs"> 
           <button class="btn add-another clone-btn" type="button">Add Another</button> 
          </div> 
         </div> 
        </div> 
       </div> 
       <hr class="item-divider"> 
      </div> 
     </section> 
     <section class="clearfix sec-lvl-btn no-display"> 
      <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 cancel-continuebtn btnRight "> 
       <div class="button-sec term-btn-holder"> 
        <div class="panel-middle"> 
         <input type="button" value="Save" id="btncontinue" class="btn btn-primary"> 
        </div> 
        <div class="panel-left"> 
         <input type="button" value="Cancel" id="cancelBtn" class="btn btn-secondary" data-toggle="modal" data-target="#editcreate-popup"> 
        </div> 
       </div> 
      </div> 
     </section> 
     <hr> 
     <!-- button section star--> 
     <section class="clearfix btn-section"> 
      <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 btnRight"> 
       <input type="button" name="prev" value="Continue" id="backPrevBtn" class="btn btn-primary"> 
      </div> 
     </section> 
     <!-- button section end--> 
    </form> 
   </div> 
   <!--page body content section start--> 
  </div> 
  <!--page middle section end--> 
  <!--page modal section start--> 
  <!--edit-create popup starts----------------------------> 
  <div class="modal fade" id="editcreate-popup" tabindex="-1" role="dialog" aria-labelledby="ModalLabel" aria-hidden="true" data-backdrop="static"> 
   <div class="modal-dialog"> 
    <div class="modal-content"> 
     <div class="modal-header"> 
      <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button> 
      <h4 class="modal-title" id="ModalLabel"><span>Unsaved Changes Alert</span></h4> 
     </div> 
     <hr class="section-divider"> 
     <div class="modal-body"> 
      <form> 
       <div class="col-xs-10 col-sm-12 col-md-12 col-lg-12 search-membership"> 
        <p> You have made changes to the page that have not been saved.</p> 
        <p> Are you sure you want to leave this page? </p> 
       </div> 
       <hr class="section-divider"> 
       <div class="modal-footer"> 
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 leave-staybtn"> 
         <input type="button" value="Leave this Page" id="leaveBtnEdit" class="btn btn-primary"> 
         <input type="button" value="Stay on this Page" id="stayBtn" data-dismiss="modal" class="btn btn-secondary"> 
        </div> 
       </div> 
      </form> 
     </div> 
    </div> 
   </div> 
  </div> 
  <!--edit-create popup ends----------------------------> 
  <!--page modal section end--> 
  <!--page footer section start--> 
  <footer> 
   <p class="text-muted credit">@ 2015 Enterprise Holdings, Inc</p> 
  </footer> 
  <!--page footer section end--> 
  <!-- Bootstrap core JavaScript
    ================================================== --> 
  <!-- Placed at the end of the document so the pages load faster -->            
 </body>
</html>