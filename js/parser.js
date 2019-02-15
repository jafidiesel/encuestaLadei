let objetoJSON = "";
let elementos = [];
function onLoad(){
    let preguntas = document.getElementsByClassName('form-group');

    for(let i = 0; i< preguntas.length; i++){
        let obj = {}
        elementos.push(obj);
        debugger;
        guardarElemento(preguntas[i], obj);
        
    }
    console.log(objetoJSON);
}

/*
Datos a almacenar por cada registro:
- Descripcion de la pregunta
- Descripcion de la opcion
- Tipo de la opcion
*/

function guardarElemento (elementoParaParsear, objeto){
    objeto = parsear(elementoParaParsear);
    
}


function parsear(element){
    let tempObj = {};

    switch (element.nodeName){
        case "DIV":
            //let resultadoDiv = "";
            let elementChildrens  = element.children;
            for (const elem of elementChildrens){
                //resultadoDiv = resultadoDiv +  parsear(elem);
                parsear(elem);
            }
            //return resultadoDiv;
            break;

        case "LABEL":
            //let resultadoLabel = "";
            if(element.children.length == 0){
                //resultadoLabel = " pregunta: '" +element.innerHTML + "', \n";
                tempObj.pregunta = element.innerHTML;
                //objetoJSON = objetoJSON + " pregunta: '" +element.innerHTML + "', \n";
                
            }else if(element.children.length > 1){
                let elementChildrens = element.children;
                for(let i = 0; i< elementChildrens.length; i++){
                    //debugger;
                    //resultadoLabel = resultadoLabel + parsear(elementChildrens[i]);
                    parsear(elementChildrens[i]);
                }
            }
            //return resultadoLabel;
            
            break;
        case "INPUT":
            if(element.type == "checkbox"){
                return "    { tipo: '"  + element.type + "', \n"  ;
                tempObj.tipo = element.type;
            }
            
            break;
            case "TEXTAREA":
                tempObj.tipo = element.nodeName;
            //return " tipo: '" +element.nodeName + "' \n";
                
                break;
        case "SELECT":
            //let resultadoSelect = ""; 
            tempObj.tipo = element.nodeName;
            //resultadoSelect = " tipo: '" +element.nodeName + "', \n";
            /*if(element.children.length > 1){
                resultadoSelect = resultadoSelect + " select: [\n ";
                
                for(let i = 0; i< element.children.length; i++){
                    resultadoSelect = resultadoSelect + " opcion: '" + element.children[i].text + "'" ;
                    
                    ( i != (element.children.length - 1) )? resultadoSelect = resultadoSelect +  ", \n" : resultadoSelect = resultadoSelect +  "] \n"   ;
                    }
                    
                    return resultadoSelect;
                }
            */
            break;
            case "BUTTON":
            let resultadoBoton = "";
            if(element.selected == "selected"){
                //resultadoBoton = " button: "+ element.innerHTML + ",\n" ;
                //resultadoBoton = resultadoBoton + " tipo: '" +element.nodeName + "' \n";
                tempObj.tipo = element.nodeName;
            }
            //return resultadoBoton;
            break;
        case "P":
                if(element.className === "help-block"){
                    tempObj.help = element.innerHTML;
                    //return " texto de ayuda: '" + element.innerHTML + "' \n" ;
                    
                }else if(element.className === "opcion" ){
                    //return "    opcion: '" + element.innerHTML + "' } \n" ;
                    tempObj.opcion = element.innerHTML;
                }else{
                    //return " p: " + element.innerHTML + "\n" ;
                    tempObj.p = element.innerHTML;

                }

            break;
    }
    return tempObj;
}


// valtype

// Metodo para obtener el contenido de un label
// el 0 representa el primer metodo de form-group
// Todos los elements que se ingresan (checkbox, pregunta con descripcion, etc) se agrupan en form-group
// elements[0].getElementsByTagName('label')[0].innerHTML

// Metodo para obtener el texto de ayuda de un input
// elements[0].querySelector(".help-block")

// Metodo para obtener los input en caso de tener checkboxes o radiobutton
// elements[1].querySelectorAll("input")

//document.getElementById('build').querySelectorAll('.form-group');
//document.getElementById('build').querySelectorAll('.form-group')[0].querySelector('label').innerHTML