import './App.css';
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Login from './components/user/login';
import Main from './components/main'
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Main/>}></Route>
        <Route path='/login' element={<Login/>}></Route>
        
      </Routes>
    </BrowserRouter>
  );
}

export default App;
