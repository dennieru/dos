function cUpper(cObj) {
	cObj.value = cObj.value.toUpperCase();
}

function atrasNo() {
	if (window.history) {
		function noBack() {
			window.history.forward()
		}
		noBack();
		window.onload = noBack;
		window.onpageshow = function(evt) {
			if (evt.persisted)
				noBack()
		}
		window.onunload = function() {
			void (0)
		}
	}
}

function noBack() {
	window.history.forward(1)
}
noBack();
atrasNo();
window.onload = noBack;
window.onload = atrasNo;
window.status = 'Venta de Valores Públicos ..:: Banco Central de Bolivia ::..';
window.onpageshow = function(evt) {
	if (evt.persisted)
		noBack();
}
window.onunload = function() {
	void (0);
}
window.onload = function() {
	detectarNavegador();
}

function detectarNavegador() {
	if (navigator.appName != "Netscape") {
		alert("No esta utilizando un Navegador compatible, por favor inicie la session con Mozilla Firefox");
	}
}

if (window.document.addEventListener) {
	window.document.addEventListener("keydown", avoidInvalidKeyStorkes, false);
} else {
	window.document.attachEvent("onkeydown", avoidInvalidKeyStorkes);
	document.captureEvents(Event.KEYDOWN);
}

function avoidInvalidKeyStorkes(evtArg) {
	var evt = (document.all ? window.event : evtArg);
	var isIE = (document.all ? true : false);
	var KEYCODE = (document.all ? window.event.keyCode : evtArg.which);
	var CTRL = (document.all ? window.event.ctrlKey : evtArg.ctrlKey);
	var ALT = (document.all ? window.event.altKey : evtArg.altKey);
	var element = (document.all ? window.event.srcElement : evtArg.target);
	if (KEYCODE == 8) { // tecla backspace
		if (element.type == "text" || element.type == "textarea"
				|| element.type == "password" || element.type == "file") {
			return true;
		} else {
			if (isIE) {
				evt.keyCode = 0;
				evt.returnValue = false;
				window.status = msg;
			} else {
				evt.preventDefault();
				evt.stopPropagation();
			}
			return false;
		}
	}
	if (CTRL) { // permitir copiar y pegar
		if (KEYCODE == 67 || KEYCODE == 99 || // Ctrl+C permitir copiar
		KEYCODE == 86 || KEYCODE == 118 || // Ctrl+V permitir pegar
		KEYCODE == 88 || KEYCODE == 120) { // Ctrl+X permitir cortar
			return true;
		} else {
			if (isIE) {
				evt.returnValue = false;
				evt.keyCode = 0;
				window.status = msg;
			} else {
				evt.preventDefault();
				evt.stopPropagation();
			}
			return false;
		}
	}
	if (ALT) {
		if (isIE) {
			evt.returnValue = false;
			evt.keyCode = 0;
			window.status = msg;
		} else {
			evt.preventDefault();
			evt.stopPropagation();
		}
	}
	switch (KEYCODE) {
	case 112: // F1
	case 113: // F2
	case 114: // F3
	case 115: // F4
	case 116: // F5
	case 117: // F6
	case 118: // F7
	case 119: // F8
	case 120: // F9
	case 121: // F10
	case 122: // F11
	case 123: // F12
	case 27: // ESCAPE
		if (isIE) {
			evt.returnValue = false;
			evt.keyCode = 0;
			window.status = msg;
		} else {
			evt.preventDefault();
			evt.stopPropagation();
		}
		break;
	default:
		window.status = "Done";
	}
}