<%@ include  file="../headerSuperAdmin.jsp" %>
<%@ include  file="../slideRightSuperAdmin.jsp" %>
<h1 class="text-center">Gestion des demandes d'inscriptions</h1>
<div class="jumbotron text-center">
  
  <form  class="form-inline">
  <div class="form-group">
  	<label>Du  </label><input id="du" style="margin-left:15px" class="form-control" type="Date" placeholder="Search">
    <label style="margin-left:15px">Au  </label><input id="au" style="margin-left:15px" class="form-control" type="Date" placeholder="Search">
    <label style="margin-left:15px">RS  </label><input id="rs" style="margin-left:15px" class="form-control" type="text" placeholder="Rs">
	<label style="margin-left:15px" class="control-label" for="endTime"><i class="glyphicon glyphicon-time"></i> Etat </label>
    <select id="etat" style="margin-left:15px" class="form-control"  ng-required="true">
    	<option>Tous</option>
    	<option>Oui</option>
    	<option>Non</option>
    </select>

    	<button style="margin-left:25px" class="btn btn-success" id="search"><i class="fas fa-search"></i> Search</button>	
    </div>
    
  </form>

</div>

<div class="action">
	<h3 style="margin-left:20px" class="d-inline">Action :</h3>
	<button id="accept" style="margin-left:25px" class="btn btn-success"><i class="fas fa-plus-circle"></i> Accepter</button>	
	<button id="refuse" style="margin-left:25px" class="btn btn-danger"><i class="fas fa-minus-square"></i> Refuser</button>	
	<button style="margin-left:25px" class="btn btn-warning"><i class="fas fa-bell"></i> Notifier</button>	
	<button id="imprimer" style="margin-left:25px" class="btn btn-info" ><i class="fas fa-print"></i> Imprimer</button>
		
</div>

<br>
<div class="container-fluid"> 
  <div class="row">
    <div class="col-md-8">
    
                  <div>
                    <table id="tableMain"  class="table table-bordered" >
                        <thead>
                          <th>id</th>
                          <th>Raison Sociale</th>
                          <th>mail</th>
                          <th>Adresse</th>
                          <th>Etat</th>
                        </thead>
                        <tbody id="tbody">
							<c:forEach var="inscription" items="${inscriptions}">
								<tr class='datarow'>
								 	<td>${inscription.id }</td>
									<td>${inscription.rsFr }</td>
									<td>${inscription.mail }</td>
									<td>${inscription.adresseFr }</td>
									<td>
									${inscription.resolu==true ? "<span class='fas fa-user'></span> active" : "<span class='fas fa-user-slash'></span> disable"}
									
									</td>
								</tr>
								
							</c:forEach>
                        </tbody>
                    </table>
                    <div class="clearfix"></div>
                 </div>
      
    </div>
    <div class="details col-md-4">
      <h3>Details :</h3>        
      <table id="impr" class="table table-condensed">
      	<thead>
          <tr>
            <th>Value</th>
            <th>Description</th>
          </tr>
        </thead>
        <tbody>
                <tr>
                    <th>id :</th>
                    <td id="id"></td>
                </tr>
                <tr>
                    <th>rsFr :</th>
                    <td id="rsFr"></td>

                </tr>
                <tr>
                    <th>rsAr :</th>
                    <td id="rsAr"></td>
                </tr>
                <tr>
                    <th>mail :</th>
                    <td id="mail"></td>
                </tr>
                <tr>
                    <th>abrvFr :</th>
                    <td id="abrvFr"></td>

                </tr>
                <tr>
                    <th>abrvAr :</th>
                    <td id="abrvAr"></td>
                </tr>
                <tr>
                    <th>tel :</th>
                    <td id="tel"></td>
                </tr>
                <tr>
                    <th>adresseFr :</th>
                    <td id="adresseFr"></td>

                </tr>
                <tr>
                    <th>adressAr :</th>
                    <td id="adressAr"></td>
                </tr>
                <tr>
                    <th>villeFr :</th>
                    <td id="villeFr"></td>
                </tr>
                <tr>
                    <th>villeAr :</th>
                    <td id="villeAr"></td>

                </tr>
                <tr>
                    <th>cp :</th>
                    <td id="cp"></td>
                </tr>
                <tr>
                    <th>observationFr :</th>
                    <td id="observationFr"></td>
                </tr>
                <tr>
                    <th>observationAr :</th>
                    <td id="observationAr"></td>
                </tr>
                <tr>
                    <th>dateDemande :</th>
                    <td id="dateDemande"></td>
                </tr>
                <tr>
                    <th>resolu :</th>
                    <td id="resolu"></td>
                </tr>
            </tbody>
      </table>
      

    </div>
    </div>
  </div>
</div>

<%@ include file="../footerSuperAdmin.jsp" %>
<script>
$(document).ready(function(){
	
	
	$(".details").hide();
	$(".action").hide();
	var id ;
	var etat;
	var rootURL = "http://localhost:8082/govSolution/rest/inscription/";
	
	$("#tableMain").on("click","tbody tr",function(){
		$(".action").show();
		var tableData = $(this).children("td").map(function() {
            return $(this).text();
        }).get();
		id=tableData[0];
		etat = tableData[4];
		
		if(etat.indexOf("active") != -1){
			$('#accept').hide();
			$('#refuse').show();
		}else{
			$('#refuse').hide();
			$('#accept').show();
		}
		
		
		
		findById(id);
		$(".details").show();
		//alert(id);
	});
	
	
	$('#accept').click(function() {
		accept(id);
		$('#accept').hide();
		$('#refuse').show();
		return false;
	});
	
	
	$('#refuse').click(function() {
		refuse(id);
		$('#refuse').hide();
		$('#accept').show();
		return false;
	});
	
	
	function accept(id) {
		$.ajax({
			type: 'GET',
			url: rootURL + 'accept/' + id,
			dataType: "json",
			success: function(data){
				
			}
		});
	}
	
	function refuse(id) {
		$.ajax({
			type: 'GET',
			url: rootURL + 'refuse/' + id,
			dataType: "json",
			success: function(data){
				
			}
		});
	}
	
	// Cette function va rechercher sur un etablissement selon l'ID 
	function findById(id) {
		console.log('findById: ' + id);
		$.ajax({
			type: 'GET',
			url: rootURL + id,
			dataType: "json",
			success: function(data){
				//console.log('findById success: ' + data.id + ' ' + data.mail);
				showList(data);
			}
		});
	}
	
	
	function showList(data) {
		$('#id').text(data.id);
		$('#rsFr').text(data.rsFr);
		$('#rsAr').text(data.rsAr);
		$('#mail').text(data.mail);
		$('#abrvFr').text(data.abrvFr);
		$('#abrvAr').text(data.abrvAr);
		$('#tel').text(data.tel);
		$('#adresseFr').text(data.adresseFr);
		$('#adressAr').text(data.adressAr);
		$('#villeFr').text(data.villeFr);
		$('#villeAr').text(data.villeAr);
		$('#cp').text(data.cp);
		$('#observationFr').text(data.observationFr);
		$('#observationAr').text(data.observationAr);
		$('#dateDemande').text(data.dateDemande);
		$('#resolu').text(data.resolu);	
	}
	
	// Cette function permet d'imprimer les informations sur un seule etablissement
	$('#imprimer').click(function () {
        var pageTitle = 'Fiche Etablissement',
            stylesheet = '//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css',
            win = window.open('', 'Print', 'width=500,height=300');
        win.document.write('<html><head><title>' + pageTitle + '</title>' +
            '<link rel="stylesheet" href="' + stylesheet + '">' +
            '</head><body>' + $('#impr')[0].outerHTML + '</body></html>');
        win.document.close();
        win.print();
        win.close();
        return false;
    });
	
	$('#search').click(function () {
		$(".details").hide();
		$(".action").hide();
		
		var Du = $('#du').val() ;
	    var Au = $('#au').val() ;
	    var RS = $('#rs').val() ;
	    var Etat = $('#etat').val() ;
	    
	    if(! $('#du').val()){
	    	Du ="NULL";
	    }
	    
	    if(! $('#au').val()){
	    	Au ="NULL";
	    }
	    
	    if(! $('#rs').val()){
	    	RS ="NULL";
	    }
	    
	    var res = rootURL + Du +"/" + Au +"/" + RS +"/" + Etat ;
	    findByUrl(res); 
	    
	    
	    return false;
    });
	
	
	
	
	
	function findByUrl(res) {
		console.log('findByUrl: ' + res);
		$.ajax({
			type: 'GET',
			url: res,
			dataType: "json",
			success: function(data){
				renderToTable(data);
			}
		});
	}
	
	
	function renderToTable(data) {
		$('#tbody tr').remove();
		$.each(data, function(index, tl) {
			var logo = "";
			if(tl.resolu==true){
				logo = "<span class='fas fa-user'></span> active";
			}else{
				logo = "<span class='fas fa-user-slash'></span> disable";
			}
			$('#tbody').append('<tr class="datarow"><td>' +tl.id +'</td><td>' + tl.rsFr +'</td><td>' + tl.mail +'</td><td>' + tl.adresseFr +'</td><td>'+ logo +'</td></tr>');
		});
		
	}
	
	
	
});
</script>
</body>

</html>