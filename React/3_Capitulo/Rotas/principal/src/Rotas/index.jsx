import React from "react";
import { BrowserRouter, Routes, Route } from 'react-router-dom';

import PaginaInicial from "../components/pages/PaginaInicial";
import PaginaFrontEnd from "../components/pages/PaginaFrontEnd";
import PaginaBackEnd from "../components/pages/PaginaBackEnd";

const Rotas = () => (
  <BrowserRouter>
    <Routes>
      <Route exact path="/"   element={<PaginaInicial/>}/>
      <Route path="/front-end" element={<PaginaFrontEnd/>}/>
      <Route path="/back-end"  element={<PaginaBackEnd/>}/>
    </Routes>
  </BrowserRouter>
);

export default Rotas;