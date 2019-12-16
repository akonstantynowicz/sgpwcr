import 'bootstrap/dist/css/bootstrap.min.css';
import React, {Component} from 'react';
import './css/App.css';

class Swapper extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            leftWinOpen: true,
            styleLeft: {backgroundColor : "#303030"},
            styleRight: {backgroundColor : "#1c1c1c"}
        }
        this.toggleLeft = this.toggleLeft.bind(this);
        this.toggleRight = this.toggleRight.bind(this);
    }


    toggleLeft() {
        this.setState({
            leftWinOpen: true,
            styleLeft: {backgroundColor : "#303030"},
            styleRight: {backgroundColor : "#1c1c1c"}
        });
    }

    toggleRight() {
        this.setState({
            leftWinOpen: false,
            styleLeft: {backgroundColor : "#1c1c1c"},
            styleRight: {backgroundColor : "#303030"}
        });
    }

    render() {
        const styleLeft = this.state.styleLeft;
        const styleRight = this.state.styleRight;
        const leftWinOpen = this.state.leftWinOpen;
        return (
            <div className="container card">
            <div className="card-header btn-group">
                <div className="col">
                    <button
                        className="btn"
                        style={styleLeft}
                        onClick={this.toggleLeft}>Login
                    </button>
                </div>
                <div className="col">
                    <button
                        className="btn"
                        style={styleRight}
                        onClick={this.toggleRight}>Register
                    </button>
                </div>
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
                <h1 className="jumbotron top">SGPWCR</h1>
                <div className="bg">
                    <div className="login">
                    <Swapper />
                    </div>
                </div>
            </div>
        );
    }
}

export default App;
