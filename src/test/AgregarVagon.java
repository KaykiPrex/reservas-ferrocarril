package test;

import negocio.ClaseABM;
import negocio.VagonABM;
import dao.FerrocarrilDao;
import datos.Clase;
import datos.Ferrocarril;
import datos.Vagon;

public class AgregarVagon {

	public static void main(String[] args) {
		VagonABM vagonABM=new VagonABM();
		FerrocarrilDao ferroDAO=new FerrocarrilDao();
		ClaseABM claseABM=new ClaseABM();
		int numeroVagon=8;
		int estadoVagon=1; // 1=libre 2=en taller 3=ocupado
		Clase clase=claseABM.traerClase(1);
		Ferrocarril ferrocarril=ferroDAO.traerFerrocarril(1);
		int ultimoIdVagon=vagonABM.agregar(numeroVagon,estadoVagon, clase, ferrocarril);
		vagonABM.GenerarButaca(vagonABM.traerVagon(ultimoIdVagon),clase);

	}

}
