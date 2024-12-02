// ingreso-datos.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-ingreso-datos',
  templateUrl: './ingreso-datos.component.html',
  styleUrls: ['./ingreso-datos.component.css']
})
export class IngresoDatosComponent {
  tipoDocumento: string = '';
  numeroDocumento: string = ''
  
  ;

  onSubmit() {
    // Aquí manejas la lógica para enviar los datos
    console.log('Enviando datos...', this.tipoDocumento, this.numeroDocumento);
  }

  formatNumber() {
    // Asegúrate de que el número tenga el formato correcto
    this.numeroDocumento = this.numeroDocumento.replace(/\D/g, ''); // Solo números
  }
}
