import React form 'react';
import ReactDOM form 'react';

class Container extends React.Component(){
   render(){
   
   return (<h1> Working with Dypraxia </h1> <br>
				<p> This website  is designed to help People Who are Dypraxic In thier working Life  </p>
				<p> Dypraxia can be a chanagle to work with, This website should provide  ways of making working life </p>
				);
   }
   
   ReactDom.render(<Container/>, document.getElementById("container"));
}