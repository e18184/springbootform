Vue.component('saludo',{
template: `
<div>
<h1>{{saludo}}</h1>
<h3>nuevo texto</h3>
<h5> segundo texto</h5>
<h6> tercer texto</h6>
</div>
`,
data(){
	return {
	saludo: 'mi primer saludo completo'
	}
}
});


new Vue({
	el:'#app1'	
});