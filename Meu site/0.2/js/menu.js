//Selecionar a página atual - click

var MenuItem = document.querySelectorAll('.item-menu')

function select(){
    MenuItem.forEach((Item)=>
        Item.classList.remove('ativo')
    )
    this.classList.add('ativo')
    MenuSide.classList.remove('expandir')
    body.classList.remove('menu')
    mainh1.classList.remove('menu')
    mainh2.classList.remove('menu')
    mainv.classList.remove('menu')
    mainf.classList.remove('menu')
    resulttxt.classList.remove('menu')
    resulttxtn.classList.remove('menu')
    resulttxtp.classList.remove('menu')
    resulttxtps1.classList.remove('menu')
    resulttxtps2.classList.remove('menu')
    resulttxtps3.classList.remove('menu')
    eutxt.classList.remove('menu')
    eutxtp.classList.remove('menu')
}

MenuItem.forEach((Item)=>
    Item.addEventListener('click',select)
)

//Selecionar a página atual - hover

var Marcositem = document.querySelector('#marcositem')
var id1 = document.querySelector('#item1')
var id3 = document.querySelector('#item3')
var id4 = document.querySelector('#item4')
var id5 = document.querySelector('#item5')
const elemento1 = document.getElementById('element1')
const elemento2 = document.getElementById('element2')
const elemento3 = document.getElementById('element3')
const elemento4 = document.getElementById('marcospage')
const elemento5 = document.getElementById('element5')
const elemento6 = document.getElementById('element6')

elemento1.addEventListener('mouseover', function() {
  id1.classList.add('ativo')
  Marcositem.classList.remove('ativo')
  id3.classList.remove('ativo')
  id4.classList.remove('ativo')
  id5.classList.remove('ativo')
});

elemento2.addEventListener('mouseover', function() {
  id1.classList.add('ativo')
  Marcositem.classList.remove('ativo')
  id3.classList.remove('ativo')
  id4.classList.remove('ativo')
  id5.classList.remove('ativo')
});

elemento3.addEventListener('mouseover', function() {
  id1.classList.add('ativo')
  Marcositem.classList.remove('ativo')
  id3.classList.remove('ativo')
  id4.classList.remove('ativo')
  id5.classList.remove('ativo')
});

elemento4.addEventListener('mouseover', function() {
  Marcositem.classList.add('ativo')
  id1.classList.remove('ativo')
  id3.classList.remove('ativo')
  id4.classList.remove('ativo')
  id5.classList.remove('ativo')
});

elemento5.addEventListener('mouseover', function() {
  id3.classList.add('ativo')
  id1.classList.remove('ativo')
  Marcositem.classList.remove('ativo')
  id4.classList.remove('ativo')
  id5.classList.remove('ativo')
});

elemento6.addEventListener('mouseover', function() {
  id4.classList.add('ativo')
  id1.classList.remove('ativo')
  Marcositem.classList.remove('ativo')
  id3.classList.remove('ativo')
  id5.classList.remove('ativo')
});


//Expandir o menu

var btnexp = document.querySelector('#btnexp')
var MenuSide = document.querySelector('.menu-lateral')
var body = document.querySelector('body')
var mainh1 = document.querySelector('main .conteiner .main-text h1')
var mainh2 = document.querySelector('main .conteiner .main-text h2')
var main = document.querySelector('main .conteiner')
var mainv = document.querySelector('#verify')
var mainf = document.querySelector('main #fundo')
var resulttxt = document.querySelector ('.resultados .resultados-text')
var resulttxtn = document.querySelector('.resultados .resultados-numeros')
var resulttxtp = document.querySelector ('.resultados .resultados-numeros p')
var resulttxtps1 = document.querySelector ('#spanr1')
var resulttxtps2 = document.querySelector ('#spanr2')
var resulttxtps3 = document.querySelector ('#spanr3')
var eutxt = document.querySelector('.eu .eu-text h2')
var eutxtp = document.querySelector('.eu .eu-text p')

btnexp.addEventListener('click', function(){
    MenuSide.classList.toggle('expandir')
    body.classList.toggle('menu')
    main.classList.toggle('menu')
    mainh1.classList.toggle('menu')
    mainh2.classList.toggle('menu')
    mainv.classList.toggle('menu')
    mainf.classList.toggle('menu')
    resulttxt.classList.toggle('menu')
    resulttxtn.classList.toggle('menu')
    resulttxtp.classList.toggle('menu')
    resulttxtps1.classList.toggle('menu')
    resulttxtps2.classList.toggle('menu')
    resulttxtps3.classList.toggle('menu')
    eutxt.classList.toggle('menu')
    eutxtp.classList.toggle('menu')
})
