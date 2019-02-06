let objetoJSON ="";
function onLoad(){
    let preguntas = document.getElementsByClassName('form-group');
    //console.log("elements.length " + preguntas.length);
    for (const pregunta of preguntas) {
        objetoJSON = objetoJSON +  " { \n";
        armarObjetoJSON(pregunta);
        objetoJSON = objetoJSON +  " } \n";
    }
    //console.log("-------------");
    //console.log(objetoJSON);
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
            let elementChildrens  = element.children;
            for (const elem of elementChildrens){
                armarObjetoJSON(elem);
            }
        break;
        case "LABEL":
            if(element.children.length == 0){
                //objetoJSON = objetoJSON + " **pregunta** " + " \n";
                objetoJSON = objetoJSON + " pregunta: '" +element.innerHTML + "' \n";
                
            }else if(element.children.length > 1){
                let elementChildrens = element.children;
                for (const elem of elementChildrens){
                    armarObjetoJSON(elem);

                }
            }
            
            break;
            case "INPUT":
                objetoJSON = objetoJSON + " tipo: '"  + element.type + "' \n"  ;
                
                break;
            case "TEXTAREA":
                //objetoJSON = objetoJSON + " textarea: '" +element.innerHTML + "' \n" ;
                objetoJSON = objetoJSON + " tipo: '" +element.nodeName + "' \n";
            
            break;
            case "SELECT":
                objetoJSON = objetoJSON + " tipo: '" +element.nodeName + "' \n";
                if(element.children.length > 1){
                    objetoJSON = objetoJSON + " select: [\n ";
                    
                    for(const option of element.children){
                        objetoJSON = objetoJSON + " opcion: '" + option.text + "' \n" ;
                    }
                    
                    objetoJSON = objetoJSON + "] \n";
                }
            
            break;
            case "BUTTON":
                if(element.selected == "selected"){
                    debugger;
                    objetoJSON = objetoJSON + " button: "+ element.innerHTML + "\n" ;
                    objetoJSON = objetoJSON + " tipo: '" +element.nodeName + "' \n";
                    
                }
            
            break;
            case "P":
            //console.log("element p " + element.nodeName);
                if(element.className === "help-block"){
                    objetoJSON = objetoJSON + " texto de ayuda: '" + element.innerHTML + "' \n" ;
                    
                }else if(element.className === "opcion" ){
                    objetoJSON = objetoJSON + " opcion: '" + element.innerHTML + "' \n" ; 
                    
                }else{
                    objetoJSON = objetoJSON + " p: " + element.innerHTML + "\n" ;

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