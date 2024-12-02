import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { IngresoDatosComponent } from './ingreso-datos/ingreso-datos.component';
import { ResumenClienteComponent } from './resumen-cliente/resumen-cliente.component';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    IngresoDatosComponent,
    ResumenClienteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule  // Este módulo debe ser importado aquí para que las rutas funcionen
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
