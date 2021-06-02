new Vue({
el: "#app",
data: {
espanol: true	
},
computed: {
	mensaje: function(){
		alert ('se ejecuta');
		if (this.espanol){
			return 'Bienvenido(a)';
		}  else {
			return 'Welcome';
		}
	}
}
}
)