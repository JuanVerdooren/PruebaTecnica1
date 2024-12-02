// resumen-cliente.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-resumen-cliente',
  templateUrl: './resumen-cliente.component.html',
  styleUrls: ['./resumen-cliente.component.css']
})
export class ResumenClienteComponent {
  primerNombre: string = 'Juan';
  segundoNombre: string = 'Carlos';
  primerApellido: string = 'Pérez';
  segundoApellido: string = 'Gómez';
  telefono: string = '3001234567';
  direccion: string = 'Calle Falsa 123';
  ciudad: string = 'Bogotá';

  volver() {
    // Redirigir a la página de búsqueda
    window.history.back();
  }
}
