window.addEventListener('scroll', function(){
    let header = this.document.querySelector('#header')
    header.classList.toggle('rolagem', window.scrollY > 400)
})

let logo = document.querySelector('#logo')
let inicio = document.querySelector('#inicio')

logo.addEventListener('mouseover', ()=>{
    inicio.classList.add('mostrar')
})

logo.addEventListener('mouseout', ()=>{
    inicio.classList.remove('mostrar')
})