const myUrl = document.URL.toString();
const promesa = fetch(myUrl)
promesa.then(resultado => console.log(resultado)), e => console.log('error callback ${e}');