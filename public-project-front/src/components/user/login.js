import React from 'react';
import { Button } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from '../header';

const Login = ()=>{

    return (
        <>
        <Header/>
        <div>

        </div>
            <h2>Login</h2>
            <form >
                <input type='text'/>
                <Button>제출</Button>
            </form>

        </>
    )
}

export default Login;