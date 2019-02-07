let objetoJSON = "";
function onLoad(){
    let preguntas = document.getElementsByClassName('form-group');
    for(let i = 0; i< preguntas.length; i++){
        objetoJSON = objetoJSON +  " { \n";
        objetoJSON = objetoJSON + armarObjetoJSON(preguntas[i]);
        
        ( i != (preguntas.length - 1) )? objetoJSON = objetoJSON +  " }, \n" : objetoJSON = objetoJSON +  " } \n";
        
    }
    console.log(objetoJSON);
}

/*
Datos a almacenar por cada registro:
- Descripcion de la pregunta
- Descripcion de la opcion
- Tipo de la opcion
*/


function armarObjetoJSON(element){
    switch (element.nodeName){
        case "DIV":
            let resultadoDiv = "";
            let elementChildrens  = element.children;
            for (const elem of elementChildrens){
                resultadoDiv = resultadoDiv + armarObjetoJSON(elem);
            }
            return resultadoDiv;
            break;
        case "LABEL":
            let resultadoLabel = "";
            if(element.children.length == 0){
                resultadoLabel = " pregunta: '" +element.innerHTML + "', \n";
                //objetoJSON = objetoJSON + " pregunta: '" +element.innerHTML + "', \n";
                
            }else if(element.children.length > 1){
                let elementChildrens = element.children;
                for(let i = 0; i< elementChildrens.length; i++){
                    //debugger;
                    resultadoLabel = resultadoLabel + armarObjetoJSON(elementChildrens[i]);

                    
                }
            }
            return resultadoLabel;
            
            break;
        case "INPUT":
                return " tipo: '"  + element.type + "', \n"  ;
                
                break;
        case "TEXTAREA":
                return " tipo: '" +element.nodeName + "' \n";
                
                break;
        case "SELECT":
            let resultadoSelect = ""; 
            resultadoSelect = " tipo: '" +element.nodeName + "' \n";
            if(element.children.length > 1){
                resultadoSelect = resultadoSelect + " select: [\n ";
                
                for(let i = 0; i< element.children.length; i++){
                    resultadoSelect = resultadoSelect + " opcion: '" + element.children[i].text + "'" ;
                    
                    ( i != (element.children.length - 1) )? resultadoSelect = resultadoSelect +  ", \n" : resultadoSelect = resultadoSelect +  "] \n"   ;
                    }
                    
                    return resultadoSelect;
                }
            
            break;
            case "BUTTON":
            let resultadoBoton = "";
            if(element.selected == "selected"){
                resultadoBoton = " button: "+ element.innerHTML + ",\n" ;
                resultadoBoton = resultadoBoton + " tipo: '" +element.nodeName + "' \n";
                
            }
            return resultadoBoton;
            break;
        case "P":
                if(element.className === "help-block"){
                    return " texto de ayuda: '" + element.innerHTML + "' \n" ;
                    
                }else if(element.className === "opcion" ){
                    return " opcion: '" + element.innerHTML + "' \n" ; 
                    
                }else{
                    return " p: " + element.innerHTML + "\n" ;

                }

            break;
    }
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