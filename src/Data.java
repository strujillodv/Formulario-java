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
        Variables.quest.get(2).anwer("VIDEO", false);
        Variables.quest.get(2).anwer("YOUTUBE", true);
        Variables.quest.get(2).anwer("SOURCE", false);
        
        Variables.quest.add(new Question("¿Cuántos Canvas puedo tener en una página web?"));
        
        Variables.quest.get(3).anwer("Los que quiera", true);
        Variables.quest.get(3).anwer("No más de diez", false);
        Variables.quest.get(3).anwer("Cinco", false);
        Variables.quest.get(3).anwer("Uno", false);
        
        Variables.quest.add(new Question("¿Cuál es el tamaño por defecto de un Canvas?"));
        
        Variables.quest.get(4).anwer("0x0", true);
        Variables.quest.get(4).anwer("100x100", false);
        Variables.quest.get(4).anwer("Siempre hay que asignarle un tamaño", false);
        Variables.quest.get(4).anwer("300x150", false);
        
        Variables.quest.add(new Question("¿Cual de las siguientes líneas de código es la correcta en HTML5?"));
        
        Variables.quest.get(5).anwer("<script type=\"text/javascript\" src=\"fichero.js\"></script>", true);
        Variables.quest.get(5).anwer("<script src=\"fichero.js\"></script>", false);
        Variables.quest.get(5).anwer("<script type=\"text/javascript1.5\" src=\"fichero.js\"></script>", false);
        Variables.quest.get(5).anwer("Las tres anteriores son correctas", false);
        
        Variables.quest.add(new Question("Qué definición de DOCTYPE es la correcta para HTML5"));
        
        Variables.quest.get(6).anwer("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 5 Transitional//EN\" \"http://www.w3.org/TR/html5/loose.dtd\">", true);
        Variables.quest.get(6).anwer("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 5 Strict//EN\" \"http://www.w3.org/TR/html5/strict.dtd\">", false);
        Variables.quest.get(6).anwer("<!DOCTYPE html>", false);
        Variables.quest.get(6).anwer("<!DOCTYPE html5>", false);
        
    }
    
}
