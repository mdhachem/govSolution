<%@ include  file="includeslib.jsp" %>
 <%@ include  file="header.jsp" %>
 <div class="container">
  <form class="form-horizontal" action=" " method="post"  id="reg_form">
    <fieldset>
      
      <!-- Form Name -->
      <legend> Informations Etablissement </legend>
    
      <!-- Text input-->
      
      <div class="form-group">
        <label class="col-md-4 control-label">RS ou Désignation</label>
        <div class="col-md-6  inputGroupContainer">
          <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <input  name="desgn" placeholder="désignation" class="form-control"  type="text">
          </div>
        </div>
      </div>
      
      <!-- Text input-->
      
      <div class="form-group">
        <label class="col-md-4 control-label" >Abréviation</label>
        <div class="col-md-6  inputGroupContainer">
          <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <input name="abreva" placeholder="Abréviation" class="form-control"  type="text">
          </div>
        </div>
      </div>
      
    
      <!-- Text input-->
      
      <div class="form-group">
        <label class="col-md-4 control-label">Tel #</label>
        <div class="col-md-6  inputGroupContainer">
          <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
            <input name="Tel" placeholder="(845)555-1212" class="form-control" type="text">
          </div>
        </div>
      </div>
      
      <!-- Text input-->
      
      <div class="form-group">
        <label class="col-md-4 control-label">Adresse</label>
        <div class="col-md-6  inputGroupContainer">
          <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
            <input name="adresse" placeholder="Adresse" class="form-control" type="text">
          </div>
        </div>
      </div>
      
      <!-- Text input-->
      
      <div class="form-group">
        <label class="col-md-4 control-label">Ville</label>
        <div class="col-md-6  inputGroupContainer">
          <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
            <input name="ville" placeholder="city" class="form-control"  type="text">
          </div>
        </div>
      </div>
      <div class="form-group">
        <label class="col-md-4 control-label">CP</label>
        <div class="col-md-6  inputGroupContainer">
          <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
            <input name="cp" placeholder="Code Postal" class="form-control"  type="text">
          </div>
        </div>
      </div>
      
      <!-- Select Basic -->
      
      <div class="form-group">
        <label class="col-md-4 control-label">Activité</label>
        <div class="col-md-6 selectContainer">
          <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
            <select name="activite" class="form-control selectpicker" >
              <option value=" " >Entrer le secteur d'activité </option>
              <option>agricole</option>
              <option>Enseignement</option>
              <option >Finance</option>
              
            </select>
          </div>
        </div>
      </div>
      
     
      
        <!-- Text area -->
      
      <div class="form-group">
        <label class="col-md-4 control-label">Observation </label>
        <div class="col-md-6  inputGroupContainer">
          <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
            <textarea class="form-control" name="obs" placeholder="Observation "></textarea>
          </div>
        </div>
      </div>
      
     
       </fieldset>
       	<legend> Compte Administrateur</legend>
        <fieldset>
        <!-- Text input-->
      <div class="form-group">
        <label class="col-md-4 control-label">Login</label>
        <div class="col-md-6  inputGroupContainer">
          <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
            <input name="login" placeholder="Login" class="form-control"  type="text">
          </div>
        </div>
      </div>
      
    
        <div class="form-group has-feedback">
            <label for="password"  class="col-md-4 control-label">
                    Mot de passe
                </label>
                <div class="col-md-6  inputGroupContainer">
                <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
            <input class="form-control" id="userPw" type="password" placeholder="mot de passe" 
                       name="password" data-minLength="5"
                       data-error="some error"
                       required/>
                <span class="glyphicon form-control-feedback"></span>
                <span class="help-block with-errors"></span>
                </div>
             </div>
        </div>
     
        <div class="form-group has-feedback">
            <label for="confirmPassword"  class="col-md-4 control-label">
                   Confirmer mot de passe
                </label>
                 <div class="col-md-6  inputGroupContainer">
                <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
            <input class="form-control {$borderColor}" id="userPw2" type="password" placeholder="Confirm password" 
                       name="confirmPassword" data-match="#confirmPassword" data-minLength="5"
                       data-match-error="some error 2"
                       required/>
                <span class="glyphicon form-control-feedback"></span>
                <span class="help-block with-errors"></span>
      			 </div>
             </div>
        </div>
     
  
      <!-- Button -->
      <div class="form-group">
        <label class="col-md-4 control-label"></label>
        <div class="col-md-4">
          <button type="submit" class="btn btn-warning" >Envoyer <span class="glyphicon glyphicon-send"></span></button>
        </div>
      </div>
    </fieldset>
  </form>

</div>
<%@ include file="footer.jsp" %>
