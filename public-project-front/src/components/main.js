import React from 'react';
import { Link } from 'react-router-dom';
import Header from './header';
import 'bootstrap/dist/css/bootstrap.min.css';

const Main = () => {
    return (
        <>
          <Header/>
        <div>
          안녕하세요
        </div>
        <Link to="/login">
        <button>헬로</button>
        </Link>
        </>
    );
};

export default Main;