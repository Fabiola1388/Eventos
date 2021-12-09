package com.proyecto.eventos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.Date;

public class PrincipalActivity extends AppCompatActivity {

    public ArrayList<Categoria> categorias = new ArrayList<>();
    public static ArrayList<Evento> eventos = new ArrayList<>();

    BottomNavigationView menu;
    Fragment fragment;
    FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        menu = findViewById(R.id.bottommenu);

        Categoria conferencias = new Categoria( 1, "Conferencias", R.drawable.conferencia );
        categorias.add( conferencias );

        Categoria ponencias = new Categoria( 2, "Ponencia", R.drawable.ponencia );
        categorias.add( ponencias );

        Categoria talleres = new Categoria( 3, "Talleres", R.drawable.talleres );
        categorias.add( talleres );

        Categoria debates = new Categoria( 4, "Debates", R.drawable.debates );
        categorias.add( debates );

        Categoria competencias = new Categoria( 5, "Competencias", R.drawable.competencias );
        categorias.add( competencias );

        eventos.add( new Evento( conferencias, "Liderazgo como los Navy Seal", "Te invito a conocer nuestra metodología \"Under Pressure Management Method\" con la que podrás adquirir hábitos que te vuelvan más asertivo, más seguro y más persuasivo.", "Calle Marsella 53, CDMX.", new Date("12/19/2021") ) );
        eventos.add( new Evento( conferencias, "Arpas y Copas", "Amamos pasar tiempo en su presencia y reunirnos como familia para adorar en su nombre.", "Sevilla 109, CDMX.", new Date("12/17/2021") ) );
        eventos.add( new Evento( conferencias, "Auditoria de procesos", "Busca y conoce donde están los puntos débiles de tus procesos, corrige y busca siempre la mejora continua.", "INSPIRE COWORKING • Nezahualcóyotl, MEX", new Date("12/15/2021") ) );
        eventos.add( new Evento( conferencias, "Gestionando el talento humano", "Se otorgará constancia con valor curricular por el ciclo completo, cupo limitado a 250 participantes. Dicha constancia será otorgada por la universidad Autónoma de Campeche", "Universidad Autonoma de Campeche", new Date("12/16/2021") ) );
        eventos.add( new Evento( conferencias, "Familias con Propósito", "Técnica única en donde no se emplean bromas, chistes ni humor; deja salir tu 'yo' interno, tu actitud juguetona y detona tu alegría!", "Por fb live YoJaJa México", new Date("12/20/2021") ) );
        eventos.add( new Evento( conferencias, "Portavoces 2022", "¿Cuáles son las marcas de una iglesia saludable? ¿Por qué es importante la disciplina de la iglesia en el evangelismo? ¿Qué es la membresía de la iglesia? ¿Pluralidad de ancianos. Cómo comenzar la transición del liderazgo del YO al NOSOTROS? ¿Evangelismo + Discipulado = Plantación de Iglesias?", "Posada Del Hidalgo Hotel 101 Miguel Hidalgo y Costilla", new Date("01/18/2021") ) );
        eventos.add( new Evento( conferencias, " Certification in LEGO® SERIOUS PLAY® methods for Teams and Groups", "LEGO® SERIOUS PLAY® es un método de facilitación reconocido internacionalmente y es utilizado por las organizaciones y empresas para involucrar a sus participantes y/o colaboradores en la generación de ideas innovadoras para la mejora organizacional. La metodología se basa en una amplia investigación y permite a los equipos abordar problemas complejos de una manera divertida y atractiva.", "Pennsylvania Business Center Pennsylvania 127, Col. Napoles", new Date("12/16/2021") ) );
        eventos.add( new Evento( conferencias, "Distribución a3p Imperllanta 2021", "Te interesa iniciar tu propio negocio y ayudar al medio ambiente distribuyendo productos ecológicos e innovadores para la construcción?", "Fábrica a3p Imperllanta Calle Uno # 393 Colonia Cuchilla Pantitlán Alcaldía Venustiano Carranza, CDMX", new Date("12/29/2021") ) );
        eventos.add( new Evento( conferencias, "Understanding Cryptocurrency & why does it matters?", "Have you ever wonder what the world would be like if all the fiat currency no longer in use... where you could be using digital currency like Bitcoin, Ethereum or even Dogecoin?", "Mexico City, MEX 97000", new Date("12/20/2021") ) );
        eventos.add( new Evento( conferencias, "La energía del dinero", "v. Baja California 114, Roma Sur, Cuauhtémoc", "Av. Baja California 114, Roma Sur, Cuauhtémoc", new Date("12/11/2021") ) );

        eventos.add( new Evento( ponencias, "Autoestima y empoderamiento femenino", "Se hablará acerca de la autoestima de mujeres víctimas de violencia, así como algunas estrategias de intervención en psicoterapia. Se reprogramará para el viernes 10 de diciembre a las 11 am, por cuestiones técnicas.", "https://fb.me/e/1k0MRxaSX", new Date("12/10/2021") ) );
        eventos.add( new Evento( ponencias, "Inmigracion", "Ponencia sobre seguridad e Inmigración", "Salones Princesa", new Date("12/12/2021") ) );
        eventos.add( new Evento( ponencias, "WORKSHOP DE LUPUS", "PREPARANDO EL EMBARAZO: SÍES Y NOES", "Hospital Universitario 12 de Octubre. Madrid", new Date("01/28/2021") ) );
        eventos.add( new Evento( ponencias, "Arte Yawi", "12/09/2021", "", new Date("12/09/2021") ) );
        eventos.add( new Evento( ponencias, "FOSAS CLANDESTINAS", "Dar a conocer a los participantes los aspectos involucrados en el desenterramiento de los cadáveres hallados en el terreno de la investigación, así como de la cadena de custodia de los restos humanos hallados.", "https://fb.me/e/1JlzI676P", new Date("12/10/2021") ) );
        eventos.add( new Evento( ponencias, "La felicidad es un fracaso", "¿Aburrido de que te digan cuál es país más feliz del mundo o la empresa donde trabaja la gente más feliz? ¡Basta ya de tanto conferencista barato! ¡La felicidad es personal!", "Online", new Date("12/09/2021") ) );
        eventos.add( new Evento( ponencias, "Industria Biotecnológica de las Proteínas", "Mesa Sectorial de Biotecnología en articulación con la Universidad Nacional de Colombia, los invita a participar en la conferencia “Industria Biotecnológica de las Proteínas”", "Ciudad de Mexico", new Date("12/09/2021") ) );
        eventos.add( new Evento( ponencias, "VICEMINISTRA DE PROMOCIÓN DE EXPORTACIONES", "Plan de Inversión y Perspectivas Económicas para el año 2022", "Hotel Oro Verde Guayaquil", new Date("12/09/2021") ) );
        eventos.add( new Evento( ponencias, "Sexualidad responsable", "Ponencia educativa - Sexualidad responsable Hosted By etoepancomio.", "Av Simón Bolívar 807", new Date("12/11/2021") ) );
        eventos.add( new Evento( ponencias, "Edificando lo que el enemigo destruye", "¡¡Te invitamos a nuestra gran conferencia de la familia!!", "Ac. 3 #8a 25, Bogotá, Colombia", new Date("12/12/2021") ) );

        eventos.add( new Evento( talleres, "Técnicas Terapéuticas", "Técnicas Terapéuticas", "57 Loma Verde,San Juan Ixtacala Plano Sur,Ciudad López Mateos,52928,MX", new Date("12/19/2021") ) );
        eventos.add( new Evento( talleres, "Posada Vocacional. Taller Turismo", "Taller Ponche Navideño.", "Posada Vocacional. Taller Turismo", new Date("12/12/2021") ) );
        eventos.add( new Evento( talleres, "Taller Navideño en La Casita", "Invitamos a tus hijos a crear artesanías navideñas, aprendiendo todo sobre el uso de las 3 R´s.", "Emma, Nativitas, 03500 Benito Juárez, CDMX", new Date("12/21/2021") ) );
        eventos.add( new Evento( talleres, "Taller de cocina Plato Navideño Vegetariano (sin derivados animales)", "El Instituto de Capacitación Nutricional Vegetariana y Naturista NaturLandia te invita a participar en el Taller de Cocina: PLATO NAVIDEÑO VEGETARIANO DE MÉXICO, VENEZUELA Y PERÚ", "Naturlandia CDMX", new Date("12/18/2021") ) );
        eventos.add( new Evento( talleres, "Taller de cirugía básica para caninos y felinos domesticos", "Curso taller de cirugía básico en caninos y felinos domésticos, avalado por concervet. Informes 5520840083 y 5581091490. ¡Inscibete! Forma parte de esta gran experiencia", "Avenida Valle del Don, Granjas Independencia, 55290 Ecatepec de Morelos, EDOMEX", new Date("12/10/2021") ) );
        eventos.add( new Evento( talleres, "Taller de Duelo y Perdidas", "Taller dirigido al publico en general, donde se abordara todo lo referente al proceso de duelo ,su etapas y formas de transitar hacia un duelo saludable", "Clínica Psicológica Avanza", new Date("12/16/2021") ) );
        eventos.add( new Evento( talleres, "Muestra de talleres: Danza aérea, rueda Cyr, mástil chino, exposición, bazar alternativo.", "Como parte del cierre de actividades de #Talleres de #CircoVolador, les invitamos a que nos acompañes el próximo 10 de diciembre a pasar un buen rato.", "Circo Volador, Centro de Arte y Cultura", new Date("12/10/2021") ) );
        eventos.add( new Evento( talleres, "Taller de Nutrición en Enfermedad Renal Crónica", "Ciudad de Mexico CDMX", "Aprendizaje directo a la práctica clínica Nutrición en paciente sin tratamiento sustitutivo, en diálisis, hemodiálisis o con uso de cetoanálogos", new Date("12/16/2021") ) );
        eventos.add( new Evento( talleres, "Conectando con tu Diosa Interna", "Un taller donde tomaremos la danza del vientre y el cuerpo como herramienta para dar poder a nuestra energía femenina para equilibrar alma, mente y espíritu a través del movimiento libre, de experimentar y sentir todos los elementos en nuestro cuerpo físico y energético.", "Circuito Río Pesquería 70, Los Paseos de Churubusco, 09030 Iztapalapa, CDMX", new Date("12/18/2021") ) );
        eventos.add( new Evento( talleres, "Reptiles voladores", "Haremos un bonito móvil con modelos en 3D que pueden imprimir en papel o cartoncillo de reptiles voladores como Dimorphodon, Tupandactylus, Pteranodon, Nyctosaurus, Tapejara y Quetzalcoatlus. Explicaremos dónde y cuándo vivieron estos organismos, que pruebas tenemos de su existencia y como se convirtieron en los reyes de aire del Mesozoico.", "https://forms.gle/FSFHjCxmcRN86AUX9", new Date("12/11/2021") ) );

        eventos.add( new Evento( debates, "Presupuesto General del Estado", "Compartimos un fragmento del debate de hoy en la Comisión de Planificación, Política Económica y Finanzas. Demostramos cuánto desconoce la oposición en materia de presupuesto.", "https://fb.me/e/2X7pJgTrQ", new Date("12/08/2021") ) );
        eventos.add( new Evento( debates, "Tenemos Que Hablar de Educación", "Este jueves 9 de diciembre nos reuniremos en la señal online de Radio ADN para presenciar este debate sobre los programas en Educación de los candidatos presidenciales. Nos acompañarán Cristian Bellei y Magdalena Vergara.", "Por definir", new Date("12/09/2021") ) );
        eventos.add( new Evento( debates, "¿Fue Jesus o Maria, El Arca del Pacto de la Nueva Alianza?", "", "https://www.youtube.com/channel/UC6b6Vc7DQ5K26cgBtzZ4HoA", new Date("01/05/2021") ) );
        eventos.add( new Evento( debates, "¿Existe la 4T?", "Participan: Manuel Pedrero, Meme Yamel y Hans Salazar", "Por definir", new Date("12/26/2021") ) );
        eventos.add( new Evento( debates, "La verdad sobre la moda rápida y La ropa que llevamos", "La reunión será por zoom y transmitida en Facebook live en la página de Toktli Educación Ambiental", "Zoom", new Date("12/09/2021") ) );
        eventos.add( new Evento( debates, "Hablemos de educación sorda", "Debate organizado por BilinSig (www.bilinsig.org): “Hablemos de la educación sorda", "Online", new Date("12/12/2021") ) );
        eventos.add( new Evento( debates, "Héroes y villanos", "Participan: Rafael Marín, Horacio Porcayo, José Luis Zárate, Raudel Ávila y Áurea Xaydé Esquivel Flores", "", new Date("12/16/2021") ) );
        eventos.add( new Evento( debates, "cuando la noche comienza", "Akoni Producciones y Sin Derechos de Autor les desea un feliz y terrorífico octubre", "YouTube", new Date("12/09/2021") ) );
        eventos.add( new Evento( debates, "Debates Hermenéuticos", "", "Jefatura del Área Histórico Social. CCH-N", new Date("12/20/2021") ) );
        eventos.add( new Evento( debates, "Nuestros niños dan a conocer sus ideas a través de propuestas claras.", "", "Colegio La Merced Puno", new Date("12/29/2021") ) );

        eventos.add( new Evento( competencias, "Arte Evangelizador", "Los invitamos a participar en el \"Concurso de Arte Evangelizador\" este 12 de diciembre a las 5:00 p.m.", "Farallón 1942, Fundadores, Santiago de Querétaro, Qro.", new Date("12/12/2021") ) );
        eventos.add( new Evento( competencias, "Piñatas Patyleta", "El colorido de las flores de cempasúchil, de terciopelo y nube, las velas para guiar a las ánimas de los fieles difuntos en su retorno a nuestro plano, lo mismo que las ‘calaveras’ en verso y la música tradicional de diversas regiones de México", "EX CONVENTO DE CHURUBUSCO", new Date("12/22/2021") ) );
        eventos.add( new Evento( competencias, "Ramas", "Para participar en este concurso sólo es necesario que integres con amistades, familia o equipo de trabajo, tú RAMA (máximo 6 integrantes)", "Por definir", new Date("12/26/2021") ) );
        eventos.add( new Evento( competencias, "Inskpirados", "¡Hola inkspirer´s! Comenzó un nuevo mes y con este llegó el nuevo concurso mensual", "", new Date("12/11/2021") ) );
        eventos.add( new Evento( competencias, "Postal Navidad 2021 para niños de 6 a 14 años", "Organizamos concurso “Postal Navidad 2021” para niños de 6 a 14 años con premio al mejor postal.", "", new Date("12/20/2021") ) );
        eventos.add( new Evento( competencias, "Cosplay 2021", "Estas cansado de tener tus cosplays e ideas enclosetados ya que covid no te deja asistir a eventos? O bien extrañas ir a ver a tus amigos y artistas favoritos?", "https://www.twitch.tv/ladygamessandra", new Date("12/11/2021") ) );
        eventos.add( new Evento( competencias, "Negocios ACE 2021", "Participantes Emprendedores Principiantes en las categorías Hombre y Mujer", "", new Date("12/09/2021") ) );
        eventos.add( new Evento( competencias, "Canino", "Se realizará una competencia de obediencia básica dividida en tres categorías: principiantes, intermedios y avanzados. Así mismo una competencia de agility entre perros grandes y pequeños. Los ganadores se llevarán un regalo sorpresa y todos los participantes un presente de parte del Club. Los esperamos! Favor de confirmar su asistencia por éste medio o vía WhatsApp", "Escuela Canina Hanyu", new Date("01/05/2021") ) );
        eventos.add( new Evento( competencias, "Baile Anual 2021", "La inscripción al concurso es gratuita. El nivel es abierto. Cupo limitado.", "La Nana, Laboratorio Urbano de Arte Comprometido", new Date("12/13/2021") ) );
        eventos.add( new Evento( competencias, "Fundación Mosaico Down", "Concurso de fin de año, con noble causa para ayudar a la Fundación Mosaico Down de San Pedro Mártir. Prueba estelar de Caballerangos", "Hípico San Pedro", new Date("12/18/2021") ) );

        fragmentManager = getSupportFragmentManager();
        CategoriasFragment categoriasFragment1 = new CategoriasFragment( categorias, eventos, fragmentManager );
        fragmentManager.beginTransaction().add( R.id.framelayout, categoriasFragment1, CategoriasFragment.class.getName() ).addToBackStack(null).commit();

        menu.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                CharSequence title = item.getTitle();
                if ("Categorias".equals(title)) {
                    CategoriasFragment categoriasFragment = new CategoriasFragment( categorias, eventos, fragmentManager );
                    fragmentManager.beginTransaction().add( R.id.framelayout, categoriasFragment, CategoriasFragment.class.getName() ).addToBackStack(null).commit();
                    return true;
                } else if ("Buscar".equals(title)) {
                    BuscadorFragment buscadorFragment = new BuscadorFragment( eventos );
                    fragmentManager.beginTransaction().add( R.id.framelayout, buscadorFragment, BuscadorFragment.class.getName() ).addToBackStack(null).commit();
                    return true;
                } else if ("Mis suscripciones".equals(title)) {
                    ArrayList<Evento> misEventos = new ArrayList<>();
                    for (Evento e:
                            PrincipalActivity.getEventos()) {
                        if (e.getSuscripto()){
                            misEventos.add(e);
                        }
                    }
                    SuscripcionesFragment suscripcionesFragment = new SuscripcionesFragment( eventos );
                    fragmentManager.beginTransaction().add( R.id.framelayout, suscripcionesFragment, SuscripcionesFragment.class.getName() ).addToBackStack(null).commit();
                    return true;
                }else{
                    return false;
                }
            }
        });
    }

    public static ArrayList<Evento> getEventos(){
        return eventos;
    }
}