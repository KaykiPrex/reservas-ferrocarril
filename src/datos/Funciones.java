package datos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funciones {
	
	public static int traerDia(GregorianCalendar f){
		return f.get(Calendar.DAY_OF_MONTH);
	}
	
	public static int traerMes(GregorianCalendar f){
		return f.get(Calendar.MONTH);
	}
	
	public static int traerhora(GregorianCalendar f){
		return f.get(Calendar.HOUR_OF_DAY);
	}

	public static int traerminutos(GregorianCalendar f){
		return f.get(Calendar.MINUTE);
	}
	
	public static int traersegundos(GregorianCalendar f){
		return f.get(Calendar.SECOND);
	}
	
	public static int traerAnio(GregorianCalendar f){
		return f.get(Calendar.YEAR);
	}
	
	
	public static boolean esBisiesto(int anio){
		return ((anio%4)==0 && (anio%100)!=0 || (anio%400)==0);	
	}
	
	public static int traerCantDiasDeUnMes(int anio, int mes){
		int resultado=0;
		switch(mes){
		case 1: resultado=31;
				break;
		case 2:if(esBisiesto(anio)){
			resultado=31;
				break;
				}
		case 3: resultado=31;
				break;
		case 4: resultado=30;
				break;
		case 5: resultado=31;
				break;
		case 6: resultado=30;
				break;
		case 7: resultado=31;
				break;
		case 8: resultado=31;
				break;
		case 9: resultado=30;
				break;
		case 10: resultado=31;
				break;
		case 11: resultado=30;
				break;
		case 12: resultado=31;
				break;
		}
		
		return resultado;
	}
	
	public static boolean esFechaValida(int anio, int mes, int dia){
		return (anio>0&&(mes>=1&&mes<=13)&&(dia>=1&&dia<=traerCantDiasDeUnMes(anio,mes)));
	}
	
	public static GregorianCalendar traerFecha(int anio, int mes, int dia){
		GregorianCalendar f=null;
		if(esFechaValida(anio,mes,dia)){
			f=new GregorianCalendar(anio,mes,dia);
		}
		return f;
	}
	
	public static GregorianCalendar traerFecha(String fecha )
	{
		
		String strDia=fecha.substring(0,2);
		String strMes=fecha.substring(3,5);
	    String strAnio=fecha.substring(6,10);
	    String strhora=fecha.substring(11,13);
	    String strminutos=fecha.substring(14,16);
	    String strsegundos=fecha.substring(17,19);
	    
	    int dia=Integer.valueOf(strDia);
	    int mes=Integer.valueOf(strMes)-1;
	    int anio=Integer.valueOf(strAnio);
	    int hora=Integer.valueOf(strhora);
	    int minuto=Integer.valueOf(strminutos);
	    int segundo=Integer.valueOf(strsegundos);
	    
	    GregorianCalendar f=null;
		if(esFechaValida(anio,mes,dia)){
			f=new GregorianCalendar(anio,mes,dia,hora,minuto,segundo);
		}
		return f;
	}
	
	public static String traerFechaCorta(GregorianCalendar f){
		
		int dia=traerDia(f);
		int mes=traerMes(f)+1;
		int anio=traerAnio(f);
		int horas=traerhora(f);
		int minutos=traerminutos(f);
		int segundos=traersegundos(f);
		String resultado;
	
		if(esFechaValida(anio,mes,dia)){
		
			String d="";
			String m="";
			String a="";
			String hor="";
			String min="";
			String seg="";
			
			a=String.valueOf(anio);
			hor=String.valueOf(horas);
			min=String.valueOf(minutos);
			seg=String.valueOf(segundos);
			if(dia<10){
				d="0"+String.valueOf(dia);
			}
			else{
				d=String.valueOf(dia);
			}
			
			if(mes<10){
				m="0"+String.valueOf(mes);
			}
			else{
				m=String.valueOf(mes);
			}
			if(minutos<10){
				min="0"+String.valueOf(minutos);
			}
			else{
				min=String.valueOf(minutos);
			}
			if(segundos<10){
				seg="0"+String.valueOf(segundos);
			}
			else{
				seg=String.valueOf(segundos);
			}
			
			resultado=(d+"/"+m+"/"+a+" "+hor+":"+min+":"+seg);
		}
		else{
			resultado="fecha invalida";
		}
		return resultado;
	}
	
	public static String traerFechaCorta(){
		GregorianCalendar fecha = new GregorianCalendar();
		int dia=traerDia(fecha);
		int mes=traerMes(fecha);
		int anio=traerAnio(fecha);
		
		String d="";
		String m="";
		String a=String.valueOf(anio);
		
		if(dia<10){
			d="0"+String.valueOf(dia);
		}
		else{
			d=String.valueOf(dia);
		}
		
		if(mes<10){
			m="0"+String.valueOf(mes);
		}
		else{
			m=String.valueOf(mes);
		}
		
		return (d+"/"+m+"/"+a);
	}
	
	public static boolean esDiaHabil (GregorianCalendar f)
	{
		int a=f.get(Calendar.DAY_OF_WEEK);
		return (a!=0 && a!=6);
	}
	
	public static String traerDiaDeLaSemana(GregorianCalendar f){
		int a=f.get(Calendar.DAY_OF_WEEK);
		String resultado="";
		switch(a){
		case 1: resultado="Domingo";
				break;
		case 2: resultado="Lunes";
				break;
		case 3: resultado="Martes";
				break;
		case 4: resultado="Miercoles";
				break;
		case 5: resultado="Jueves";
				break;
		case 6: resultado="Viernes";
				break;
		case 7: resultado="Sabado";
				break;
		}
		return resultado;
	}
	
	public static String traerMesEnLetras(GregorianCalendar fecha){
		int a=fecha.get(Calendar.MONTH);
		String resultado="";
		switch(a){
		case 0: resultado="Enero";
				break;
		case 1: resultado="Febrero";
				break;
		case 2: resultado="Marzo";
				break;
		case 3: resultado="Abril";
				break;
		case 4: resultado="Mayo";
				break;
		case 5: resultado="Junio";
				break;
		case 6: resultado="Julio";
				break;
		case 7: resultado="Agosto";
				break;
		case 8: resultado="Septiembre";
				break;
		case 9: resultado="Octubre";
				break;
		case 10: resultado="Noviembre";
				break;
		case 11: resultado="Diciembre";
				break;
		}
		return resultado;
	}
	
	public static String traerFechaLarga(GregorianCalendar fecha){
		return (traerDiaDeLaSemana(fecha)+" "+traerDia(fecha)+" de "+traerMesEnLetras(fecha)+" de "+traerAnio(fecha));
	}
	
	public static boolean sonFechasIguales(GregorianCalendar fecha1, GregorianCalendar fecha2){
		
		int mesFecha1=traerMes(fecha1);
		int mesFecha2=traerMes(fecha2);
		int anioFecha1=traerAnio(fecha1);
		int anioFecha2=traerAnio(fecha2);
		
		return ( mesFecha1==mesFecha2 && anioFecha1==anioFecha2);
	}
	
	public static double aproximar2Decimal(double numero){
		String numCadena=String.valueOf(numero);
		String[] cadena= numCadena.split("\\.");

		
		String partEntera=cadena[0];
		String partDecimal=cadena[1];
		double resultado=0;
		
		double primerDecimal=Double.parseDouble(partDecimal.substring(0,1));
		double segundoDecimal=Double.parseDouble(partDecimal.substring(1,2));
		double tercerDecimal=Double.parseDouble(partDecimal.substring(2,3));
		
		if(tercerDecimal>=5){
			segundoDecimal++;
		}
		
		resultado=Integer.parseInt(partEntera);
		resultado=resultado+(primerDecimal/10)+(segundoDecimal/100);
		
		return resultado;
	}
}
