<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.no-icons.min.css" rel="stylesheet">
<link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">

<center>

	<h1>Prezzi Pazzi</h1>
	
		Ciao il tuo username è: <b>${utenteInSessione.username}</b><br/>
		il tuo ruolo è: <b>${utenteInSessione.ruolo.descrizione }</b>
	<div align="right">
		<a class="btn btn-success" href="home.jsp"><i class="icon-home"></i><b> HOME</b></a>
		<a class="btn btn-danger" href="utenti.do?method=esci"><i class="icon-signout"></i><b> LOGOUT</b></a>
	</div>
</center>