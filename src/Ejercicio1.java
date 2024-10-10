import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*  Generador de Horoscopo
            Pida fecha de nacimiento en formato DD/MM/AAAA e imprime signo zodiaco y un mensaje de horoscopo correspondiente
            
            Aries (March 21 - April 19)
            Taurus (April 20 - May 20)
            Gemini (May 21 - June 20)
            Cancer (June 21 - July 22)
            Leo (July 23 - August 22)
            Virgo (August 23 - September 22)
            Libra (September 23 - October 22)
            Scorpio (October 23 - November 21)
            Sagittarius (November 22 - December 21)
            Capricorn (December 22 - January 19)
            Aquarius (January 20 - February 18)
            Pisces (February 19 - March 20)

        */
        // input string, convert to 3 ints,
        // match case to dates
        // select random proverb
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese fecha de nacimiento en formato DD/MM/AAAA: ");
        String fechaS = sc.nextLine();
        String[] splitted = fechaS.split("/"); // puedo usar substring
        int d, m;
        d = Integer.parseInt(splitted[0]);
        m = Integer.parseInt(splitted[1]);
        String[] zodiac = checkZodiac(d, m);
        System.out.println(zodiac[0] + " Horoscopo: " + zodiac[1]);


    }
    public static String[] checkZodiac(int d, int m) {
        // input day and month, return array with zodiac in 0, horo in 1
        String[] reValue = new String[2];
        String z, h;
        switch (m) {
            case 1:
                if (d < 20) {
                    //Capricorn
                    z = "Capricorn";
                    h = "Hoy es un día para la disciplina y la perseverancia, Capricornio. Tu capacidad para trabajar duro y ser responsable te ayudará a alcanzar tus metas. Aprovecha esta energía para planificar y ejecutar tus proyectos. Sin embargo, no te olvides de tomar descansos y cuidar de tu bienestar.";
                } else {
                    //Aquarius
                    z = "Aquarius";
                    h = "Hoy es un día para la innovación y la originalidad, Acuario. Tu capacidad para pensar de manera diferente y ser independiente te ayudará a encontrar soluciones creativas a los problemas. Aprovecha esta energía para colaborar con los demás y hacer del mundo un lugar mejor. Sin embargo, evita el aislamiento y mantén el contacto con tus seres queridos.";
                }
                break;
            case 2:
                if (d < 19) {
                    //Aquarius
                    z = "Aquarius";
                    h = "Hoy es un día para la innovación y la originalidad, Acuario. Tu capacidad para pensar de manera diferente y ser independiente te ayudará a encontrar soluciones creativas a los problemas. Aprovecha esta energía para colaborar con los demás y hacer del mundo un lugar mejor. Sin embargo, evita el aislamiento y mantén el contacto con tus seres queridos.";
                } else {
                    //Pisces
                    z = "Pisces";
                    h = "Hoy es un día para la empatía y la intuición, Piscis. Tu capacidad para conectar con los demás a un nivel profundo te ayudará a ofrecer apoyo y comprensión. Aprovecha esta energía para ayudar a los demás y encontrar la paz interior. Sin embargo, ten cuidado de no absorber demasiado las emociones de los demás y cuida de ti mismo.";
                }
                break;
            case 3:
                if (d < 19) {
                    //Pisces
                    z = "Pisces";
                    h = "Hoy es un día para la empatía y la intuición, Piscis. Tu capacidad para conectar con los demás a un nivel profundo te ayudará a ofrecer apoyo y comprensión. Aprovecha esta energía para ayudar a los demás y encontrar la paz interior. Sin embargo, ten cuidado de no absorber demasiado las emociones de los demás y cuida de ti mismo.";
                } else {
                    //Aries
                    z = "Aries";
                    h = "Hoy es un día lleno de energía y entusiasmo para ti, Aries. Aprovecha esta vitalidad para iniciar nuevos proyectos o actividades que has estado postergando. Tu determinación y pasión te llevarán lejos. Sin embargo, ten cuidado de no ser demasiado impulsivo en tus decisiones.";
                }
                break;
            case 4:
                if (d < 19) {
                    //Aries
                    z = "Aries";
                    h = "Hoy es un día lleno de energía y entusiasmo para ti, Aries. Aprovecha esta vitalidad para iniciar nuevos proyectos o actividades que has estado postergando. Tu determinación y pasión te llevarán lejos. Sin embargo, ten cuidado de no ser demasiado impulsivo en tus decisiones.";
                } else {
                    //Taurus
                    z = "Taurus";
                    h = "Hoy es un día para disfrutar de las cosas simples de la vida, Tauro. Encuentra tiempo para relajarte y disfrutar de la compañía de tus seres queridos. Tu estabilidad y paciencia serán recompensadas. Evita el estrés innecesario y mantén la calma.";
                }
                break;
            case 5:
                if (d < 19) {
                    //Taurus
                    z = "Taurus";
                    h = "Hoy es un día para disfrutar de las cosas simples de la vida, Tauro. Encuentra tiempo para relajarte y disfrutar de la compañía de tus seres queridos. Tu estabilidad y paciencia serán recompensadas. Evita el estrés innecesario y mantén la calma.";
                } else {
                    //Gemini
                    z = "Gemini";
                    h = "Hoy es un día perfecto para la comunicación y el intercambio de ideas, Géminis. Tu mente estará especialmente activa y llena de creatividad. Aprovecha esta energía para resolver problemas y compartir tus pensamientos con los demás. Sin embargo, ten cuidado de no dispersarte demasiado.";
                }
                break;
            case 6:
                if (d < 19) {
                    //Gemini
                    z = "Gemini";
                    h = "Hoy es un día perfecto para la comunicación y el intercambio de ideas, Géminis. Tu mente estará especialmente activa y llena de creatividad. Aprovecha esta energía para resolver problemas y compartir tus pensamientos con los demás. Sin embargo, ten cuidado de no dispersarte demasiado.";
                } else {
                    //Cancer
                    z = "Cancer";
                    h = "Hoy es un día para centrarte en tus emociones y en tu hogar, Cáncer. Pasa tiempo con tu familia y amigos cercanos. Tu sensibilidad y empatía te ayudarán a fortalecer tus relaciones. Evita tomar decisiones importantes hoy y confía en tu intuición.";
                }
                break;
            case 7:
                if (d < 19) {
                    //Cancer
                    z = "Cancer";
                    h = "Hoy es un día para centrarte en tus emociones y en tu hogar, Cáncer. Pasa tiempo con tu familia y amigos cercanos. Tu sensibilidad y empatía te ayudarán a fortalecer tus relaciones. Evita tomar decisiones importantes hoy y confía en tu intuición.";
                } else {
                    //Leo
                    z = "Leo";
                    h = "Hoy es un día para brillar y destacarte, Leo. Tu carisma y confianza te llevarán a ser el centro de atención. Aprovecha esta energía para liderar y motivar a los demás. Sin embargo, ten cuidado de no ser demasiado egocéntrico y escucha a los demás.";
                }
                break;
            case 8:
                if (d < 19) {
                    //Leo
                    z = "Leo";
                    h = "Hoy es un día para brillar y destacarte, Leo. Tu carisma y confianza te llevarán a ser el centro de atención. Aprovecha esta energía para liderar y motivar a los demás. Sin embargo, ten cuidado de no ser demasiado egocéntrico y escucha a los demás.";
                } else {
                    //Virgo
                    z = "Virgo";
                    h = "Hoy es un día para la organización y la atención a los detalles, Virgo. Tu capacidad analítica y tu sentido práctico te ayudarán a resolver problemas y mejorar tu entorno. Aprovecha esta energía para ordenar y planificar tus actividades. Sin embargo, no te olvides de cuidar de ti mismo.";
                }
                break;
            case 9:
                if (d < 19) {
                    //Virgo
                    z = "Virgo";
                    h = "Hoy es un día para la organización y la atención a los detalles, Virgo. Tu capacidad analítica y tu sentido práctico te ayudarán a resolver problemas y mejorar tu entorno. Aprovecha esta energía para ordenar y planificar tus actividades. Sin embargo, no te olvides de cuidar de ti mismo.";
                } else {
                    //Libra
                    z = "Libra";
                    h = "Hoy es un día para el equilibrio y la armonía, Libra. Tu capacidad para ver ambos lados de una situación te ayudará a tomar decisiones justas y equilibradas. Aprovecha esta energía para mejorar tus relaciones y encontrar la paz interior. Sin embargo, evita la indecisión y confía en tu juicio.";
                }
                break;
            case 10:
                if (d < 19) {
                    //Libra
                    z = "Libra";
                    h = "Hoy es un día para el equilibrio y la armonía, Libra. Tu capacidad para ver ambos lados de una situación te ayudará a tomar decisiones justas y equilibradas. Aprovecha esta energía para mejorar tus relaciones y encontrar la paz interior. Sin embargo, evita la indecisión y confía en tu juicio.";
                } else {
                    //Scorpio
                    z = "Scorpio";
                    h = "Hoy es un día para la intensidad y la transformación, Escorpio. Tu capacidad para profundizar en las cosas te ayudará a descubrir verdades ocultas y a transformar tu vida. Aprovecha esta energía para enfrentar tus miedos y superar obstáculos. Sin embargo, ten cuidado de no ser demasiado obsesivo.";
                }
                break;
            case 11:
                if (d < 19) {
                    //Scorpio
                    z = "Scorpio";
                    h = "Hoy es un día para la intensidad y la transformación, Escorpio. Tu capacidad para profundizar en las cosas te ayudará a descubrir verdades ocultas y a transformar tu vida. Aprovecha esta energía para enfrentar tus miedos y superar obstáculos. Sin embargo, ten cuidado de no ser demasiado obsesivo.";
                } else {
                    //Sagittarius
                    z = "Sagittarius";
                    h = "Hoy es un día para la aventura y la exploración, Sagitario. Tu espíritu libre y tu curiosidad te llevarán a descubrir nuevos horizontes. Aprovecha esta energía para viajar, aprender y compartir tus experiencias con los demás. Sin embargo, evita la imprudencia y mantén los pies en la tierra.";
                }
                break;
            case 12:
                if (d < 19) {
                    //Sagittarius
                    z = "Sagittarius";
                    h = "Hoy es un día para la aventura y la exploración, Sagitario. Tu espíritu libre y tu curiosidad te llevarán a descubrir nuevos horizontes. Aprovecha esta energía para viajar, aprender y compartir tus experiencias con los demás. Sin embargo, evita la imprudencia y mantén los pies en la tierra.";
                } else {
                    //Capricorn
                    z = "Capricorn";
                    h = "Hoy es un día para la disciplina y la perseverancia, Capricornio. Tu capacidad para trabajar duro y ser responsable te ayudará a alcanzar tus metas. Aprovecha esta energía para planificar y ejecutar tus proyectos. Sin embargo, no te olvides de tomar descansos y cuidar de tu bienestar.";
                }
                break;
            default:
                //error
                z = "Error";
                h = "Error";
        }
        reValue[0] = z;
        reValue[1] = h;
        return reValue;
    }
}
