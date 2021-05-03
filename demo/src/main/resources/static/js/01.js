const ap1 = new Vue({
  el:'#ap1',
  data: {
    micadena:"Curso de Taller 1 Grupo 2",
    micadena2:"Curso de redes "
  }
}
)
const app = new Vue({
  el: '#app',
  data: {
    titulo: 'Hola mundo con Vue',
    frutas: [
      {nombre:'Pera', cantidad:10},
      {nombre:'Manzana', cantidad:0},
	  {nombre:'Platano', cantidad:11},
	  {nombre:'Jenjibre', cantidad:0}
    ],
    nuevaFruta:''
  },
  methods: {
    agregarFruta(){
      console.log('se presiono el boton');
      this.frutas.push({
        nombre:this.nuevaFruta,cantidad:0
      }
      )
    },
    otroMetodo(){
      console.log('otro metodo')
    }
  }
})