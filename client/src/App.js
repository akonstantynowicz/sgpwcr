import 'bootstrap/dist/css/bootstrap.min.css';
import React, {Component} from 'react';
import './css/App.css';
import LoginScreen from './LoginScreen';
import VillageView from './Village';

class App extends Component {
	render() {
		return(
			<VillageView/>
			//<LoginScreen/>
		);
	}
}

export default App;
