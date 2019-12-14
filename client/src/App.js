import 'bootstrap/dist/css/bootstrap.min.css';
import React, {Component} from 'react';
import './App.css';

class Swapper extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      leftWinOpen: true,
    }
    this.toggleLeft = this.toggleLeft.bind(this);
    this.toggleRight = this.toggleRight.bind(this);
  }

  toggleLeft() {
    this.setState({ leftWinOpen: true});
  }

  toggleRight() {
    this.setState({ leftWinOpen: false});
  }

  render() {
    const leftWinOpen = this.state.leftWinOpen;
    return (
      <div className="container card main-form">
		<div className="card-header btn-group">
        <button className="btn btn-secondar" onClick={this.toggleLeft}>Login</button>
        <button className="btn btn-secondar" onClick={this.toggleRight}>Register</button>
		</div>
        {leftWinOpen ? (
          <LoginForm />
        ) : (
          <RegisterForm />
        )}
      </div>
    );
  }
}


class LoginForm extends React.Component {
	render() {
    return (
        <form className="card-body">
			<div className="form-group">
				<label for="username">Username</label>  
				<input type="text" id="username" class="form-control"></input>
			</div>
			<div className="form-group">
				<label for="password">Password</label>
				<input type="text" id="password" class="form-control"></input>
			</div>
         </form>
    )
	}
}


class RegisterForm extends React.Component {
	render() {
    return (
        <form className="card-body">
			<div className="form-group">
				<label for="email">Email</label>
				<input type="text" id="email" class="form-control"></input>
			</div>		
			<div className="form-group">
				<label for="username">Username</label>  
				<input type="text" id="username" class="form-control"></input>
			</div>
			<div className="form-group">
				<label for="password">Password</label>
				<input type="text" id="password" class="form-control"></input>
			</div>
         </form>
    );
	}
}

class App extends Component {
  render() {
	console.log('I was triggered during render');
    return (
        <div className="App">
          <h1 className="jumbotron">SGPWCR</h1>
          <Swapper />
        </div>
    );
  }
}

export default App;
