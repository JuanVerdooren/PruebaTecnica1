import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';  // Importar RouterModule y Routes
import { IngresoDatosComponent } from './ingreso-datos/ingreso-datos.component';
import { ResumenClienteComponent } from './resumen-cliente/resumen-cliente.component';

const routes: Routes = [
  { path: '', component: IngresoDatosComponent },  // Ruta principal
  { path: 'resumen', component: ResumenClienteComponent }  // Ruta de resumen
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],  // Configurar las rutas
  exports: [RouterModule]  // Exportar RouterModule para que otras partes de la app puedan usarlo
})
export class AppRoutingModule { }
