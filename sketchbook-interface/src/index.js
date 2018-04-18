import React from 'react';
import ReactDom from 'react-dom';
import { Provider } from 'react-redux'
import Coin from './main/webapp/components/coin/coin';
import Store from './main/webapp/components/coin/store';

const renderApp = () => {
	ReactDom.render(
		<Provider store={Store}>
			<Coin />
		</Provider>,
		document.getElementById("root")
	);
};

Store.subscribe(renderApp);
renderApp();