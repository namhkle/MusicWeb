import React from 'react';
import './App.css';
import './index.css';
import Comment from "./components/Comment";
import UserThread from './components/UserThread';
import { Fragment } from 'react';
function App() {
  return (
    <Fragment>
      <Comment/>
      <UserThread/>
    </Fragment>
  );
}

export default App;
