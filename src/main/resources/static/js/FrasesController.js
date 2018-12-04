/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var frase;
var Frases = (function () {
    function postFrases(){
        var frase = document.getElementById("x").value;
        axios.post('/info',frase).then(function (response){
            console.log('save succesfully')
 
        }).catch(function(error){
                console.log(error);
            });
    }
    function eraser(){
        axios.post('/info/era',frase).then(function (response){
            console.log('save succesfully')
 
        }).catch(function(error){
                console.log(error);
            });           
    }
    return {
        postFrases: postFrases,
        eraser:eraser
    
    };
})();

   var Company=(function(){

    var getEmpresa=function(llama){
    
    axios.get('/info').then(function (response) {
            llama.Eraser();
            console.log(response.data);                
            llama.exito(response.data);
          
        })
        .catch(function (error) {
            
            console.log(error);
        });
    };
    return {
        getEmpresa:getEmpresa
    };
    })(); 





