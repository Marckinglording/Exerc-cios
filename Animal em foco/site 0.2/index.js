let ImgSlider = document.querySelectorAll('.slider-conteiner .slider-box')
let BtnPost = document.querySelector('#posterior')
let BtnAnt = document.querySelector('#anterior')
let BtnNav = document.querySelectorAll('.btn-nav-box .btn-nav')

let ContadorImg = ImgSlider.length
let ImgAtiva = 0

setInterval(function(){
    ImgAtiva++
    if(ImgAtiva >= ContadorImg){
        ImgAtiva = 0
    }
    MostrarSlider()
}, 7000)

BtnPost.addEventListener('click', ()=>{
    ImgAtiva++
    if(ImgAtiva >= ContadorImg){
        ImgAtiva = 0
    }

    MostrarSlider()
})

BtnAnt.addEventListener('click', ()=>{
    ImgAtiva--
    if(ImgAtiva < 0){
        ImgAtiva = ContadorImg - 1
    }

    MostrarSlider()
})

function MostrarSlider(){
    let ImgAntiga = document.querySelector('.slider-conteiner .slider-box.ativo')
    let BtnNavAntigo = document.querySelector('.btn-nav-box .btn-nav.ativo')

    ImgAntiga.classList.remove('ativo')
    BtnNavAntigo.classList.remove('ativo')

    ImgSlider[ImgAtiva].classList.add('ativo')
    BtnNav[ImgAtiva].classList.add('ativo')
}

BtnNav.forEach((btn, indice)=>{
    btn.addEventListener('click', ()=>{
        ImgAtiva = indice;
        MostrarSlider()
    })
})

let logo = document.querySelector('#logo')
let inicio = document.querySelector('#inicio')

logo.addEventListener('mouseover', ()=>{
    inicio.classList.add('mostrar')
})

logo.addEventListener('mouseout', ()=>{
    inicio.classList.remove('mostrar')
})