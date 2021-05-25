
<h2> meta-rom </h2>   
    <h3>rom-image-qt.bb</h3>
      <ul>
        <li> Predefined users & password ( user=root, password=romrobotics; user=rom,password=robotics; )<b>OK</b></li>
        <li> Force to change password <b>OK</b></li>
        <li> Static ip (192.168.1.10/24 ) <b>OK</b></li>
        <li> Openssh server <b>OK</b></li>        
        <li> Qt app runnable <b>OK</b></li>
        <li> Target device ရဲ့ /etc/profile မှာ ထည့်ဖို့ export QT_QPA_PLATFORM=eglfs လိုပါတယ်။ <b>OK</b></li>
        <li>export QT_QPA_FONTDIR=/usr/share/fonts/truetype
export QT_QPA_PLATFORM=eglfs</li>
        <li> rom logo splash screen <b>OK</b></li>
        <li> QT Creator နှင့်ချိတ်ဆက်ရန် OK</li>
        <li> font Vera OK </li>
        <li> qml အတွက် libgl.so ရအောင် /usr/lib မှာ cp libGLESv2.so.2 libGL.so.1  OK</li>
      <ul>
          <p> စိတ်ရှုပ် မခံချင်ဘူးဆိုရင်တော့ pi 4 အတွက် image ကို <a href="https://drive.google.com/file/d/1aa0ApRkoJTcht2sV-EEf85IU9aLzi4YY/view?usp=sharing"> ဒီမှာ </a> ဒေါင်းပါ။ </p>  
    <h3> to be continue </h3>
      <ul>   
        <li> eglfs resolution ကျန် grid layout စမ်းသုံးရန်</li>        
      </ul>
      
        
    	
