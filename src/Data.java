/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author struj
 */
public class Data {
    
    public Data() {
        
        Variables.quest.add(new Question("¿Para qué sirve el atributo autoplay del elemento AUDIO?"));
        
        Variables.quest.get(0).anwer("Muestra un panel para gestionar el sonido", false);
        Variables.quest.get(0).anwer("No existe el atributo autoplay en HTML5", false);
        Variables.quest.get(0).anwer("Permite reproducir música de forma infinita", false);
        Variables.quest.get(0).anwer("Permite iniciar la música de forma automática", true);
        
        Variables.quest.add(new Question("¿Qué elemento utilizamos para insertar audio en HTML5?"));
        
        Variables.quest.get(1).anwer("SOUND", false);
        Variables.quest.get(1).anwer("BGSOUND", false);
        Variables.quest.get(1).anwer("AUDIO", true);
        Variables.quest.get(1).anwer("SOURCE", false);
        
        Variables.quest.add(new Question("¿Qué elemento utilizamos para insertar un vídeo en HTML5?"));
        
        Variables.quest.get(2).anwer("FILM", false);
        Variables.quest.get(2).anwer("VIDEO", true);
        Variables.quest.get(2).anwer("YOUTUBE", false);
        Variables.quest.get(2).anwer("SOURCE", false);
        
        Variables.quest.add(new Question("¿Cuántos Canvas puedo tener en una página web?"));
        
        Variables.quest.get(3).anwer("Los que quiera", true);
        Variables.quest.get(3).anwer("No más de diez", false);
        Variables.quest.get(3).anwer("Cinco", false);
        Variables.quest.get(3).anwer("Uno", false);
        
        Variables.quest.add(new Question("¿Qué etiqueta es correcta en HTML5?"));
        
        Variables.quest.get(4).anwer("<script type=\"text/javascript\" src=\"fichero.js\"></script>", false);
        Variables.quest.get(4).anwer("<script src=\"fichero.js\"></script>", false);
        Variables.quest.get(4).anwer("<script type=\"text/javascript1.5\" src=\"fichero.js\"></script>", false);
        Variables.quest.get(4).anwer("Las tres anteriores son correctas", true);
        
        Variables.quest.add(new Question("¿Qué definición de DOCTYPE es la correcta para HTML5?"));
        
        Variables.quest.get(5).anwer("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 5 Transitional//EN\" \"http://www.w3.org/TR/html5/loose.dtd\">", false);
        Variables.quest.get(5).anwer("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 5 Strict//EN\" \"http://www.w3.org/TR/html5/strict.dtd\">", false);
        Variables.quest.get(5).anwer("<!DOCTYPE html>", false);
        Variables.quest.get(5).anwer("<!DOCTYPE html5>", true);
        
        Variables.quest.add(new Question("¿Qué atributo nos sirve para definir estilos en línea?"));
        
        Variables.quest.get(6).anwer("css", false);
        Variables.quest.get(6).anwer("font", false);
        Variables.quest.get(6).anwer("script", false);
        Variables.quest.get(6).anwer("style", true);
        
        Variables.quest.add(new Question("¿Qué significa CSS?"));
        
        Variables.quest.get(7).anwer("Computer Style Sheet", false);
        Variables.quest.get(7).anwer("Concerned Style Sheet", false);
        Variables.quest.get(7).anwer("Cascade Style Sheet", true);
        Variables.quest.get(7).anwer("Colored Style Sheet", false);
        
        Variables.quest.add(new Question("¿Cómo puedo dar estilo al tamaño de fuente de todos los elementos H2 de una página?"));
        
        Variables.quest.get(8).anwer("h2 {font-size:20px;}", true);
        Variables.quest.get(8).anwer("h2.all {font-size:20px;}", false);
        Variables.quest.get(8).anwer("h2#all {font-size:20px;}", false);
        Variables.quest.get(8).anwer("all#h2 {font-size:20px;}", false);
        
        Variables.quest.add(new Question("¿Como puedo resaltar el contenido de un párrafo?"));
        
        Variables.quest.get(9).anwer("p {font-weight:bold;}", false);
        Variables.quest.get(9).anwer("p {font-color:#000;}", true);
        Variables.quest.get(9).anwer("p {font:#000}", false);
        Variables.quest.get(9).anwer("p {rgb:(0,0,0)}", false);
        
        Variables.quest.add(new Question("¿Qué propiedad sirve para cambiar el color de fondo?"));
        
        Variables.quest.get(10).anwer("bgcolor", false);
        Variables.quest.get(10).anwer("color", false);
        Variables.quest.get(10).anwer("background-color", true);
        Variables.quest.get(10).anwer("Se puede cambiar con las tres", false);
        
        Variables.quest.add(new Question("¿En qué parte de la página se definen las hojas de estilos externas?"));
        
        Variables.quest.get(11).anwer("En el HEAD de la página", true);
        Variables.quest.get(11).anwer("Justo después del elemento BODY", false);
        Variables.quest.get(11).anwer("En cualquier parte de la página", false);
        Variables.quest.get(11).anwer("Al final de la página", false);
        
        Variables.quest.add(new Question("¿Qué atributo CSS nos permite configurar el estilo del puntero del ratón?"));
        
        Variables.quest.get(12).anwer("cursor", true);
        Variables.quest.get(12).anwer("pointer", false);
        Variables.quest.get(12).anwer("icon", false);
        Variables.quest.get(12).anwer("moise", false);
        
    }
    
}
