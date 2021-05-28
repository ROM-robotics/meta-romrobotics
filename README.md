
<h2> meta-rom </h2> 
    <h3>rom-image-qt-dev.bb</h3>
      <p> သူကတော့ rom-image-qt-dev ထဲမှာပဲ raspi2fb ထဲ့ပေးထားတာပါ။ recipes က recipes-graphics ထဲမှာရှိပါတယ်။ config.txt နမူနာ နဲ့ waveshare 3.5 lcd အတွက် dbt ကိုလည်းထည့်ပေးထားပါတယ်။ </p>
      <p> boot တက်လာရင် ls /dev/fb* နဲ့စစ်ပါ။ fb0 သည် hdmi အတွက် fb1 သည် lcd အတွက်ဖြစ်ပါတယ်။ ls /dev/input ကို စစ်ရင်လဲ touchscreen0 
      link ကိုတွေ့ပါမယ်။ </p>
      <p> config.txt ကို ခနခနသွားပြင်ရမှာမို့ sd ဖြုတ်လိုက်တပ်လိုက်မဖြစ်ရလေအောင် မောင့်ရအောင်။ mount point ဖန်တီးမယ် ( $ mkdir /mnt/fat ) ပြီးရင် fstab ကို သွားပြီး ဒီလိုင်း -> ( /dev/mmcblk0p1 /mnt/fat auto defaults 0 0 ) ကို comment ဖြုတ်ပေါ့။ ကျတော့် image မှာတော့ ပါမှာမဟုတ်ဘူး။ အဲ့တော့ အသစ်ရေးပေးပါ။ ပြီးရင် မောင့်ပါ။ ( mount /dev/mmcblk0p1 /mnt/fat) အာ့ဆို /mnt/fat/config.txt ကို ပြင်လို့ရပါပြီ။ </p>
      <p> အဲ့မှာ overlays directory ထဲမှာ repo ထဲက waveshare* တွေကို copy ကူးထည့်ပါ။ </p>
      <p> linuxfb platform plugin သုံးရင် OpenGL မလိုပါဘူး။ /dev/fb1 နဲ့ တိုက်ရိုက်ချိတ်နိုင်တယ်။ Qt Widgets Application တွေအတွက် လွယ်လွယ် setup လုပ်လို့ရတာပေါ့။ </p>
<h3>linuxfb အတွက် </h3>
<p> waveshare lcd 3.5 အတွက် config.txt မှာ  တို့ကိုရေးပါ။ <br>
disable_overscan=1 <br>
dtparam=spi=on<br>
dtoverlay=waveshare35a<br>
#dtoverlay=pitft35-resistive,rotate=90,speed=32000000,fps=60   <br>  
#dtoverlay=pitft28-resistive,rotate=270,speed=32000000,fps=60<br>
      </p>
      <p> /etc/profile.d/qt5-env.sh ထဲမှာတော့ အောက်ပါအတိုင်းရေးပါ။ <br>
export PATH=${PATH}:/usr/bin/qt5<br>
export QT_QPA_PLATFORM=linuxfb:fb=/dev/fb1<br>
export QT_QPA_EVDEV_TOUCHSCREEN_PARAMETERS=/dev/input/touchscreen0:rotate=90<br>
export QT_QPA_FB_TSLIB=1<br>
export TSLIB_FBDEVICE=/dev/fb1<br>
export TSLIB_TSDEVICE=/dev/input/touchscreen0<br>
</p>
<p> /etc/profile ထဲမှာတော့ QT_QPA_PLATFORM=linuxfb ထည့်ပေးပါ။</p><br>
<p> ဒီအချိန်မှာ $ ts_calibrate နဲ့ calibrate လုပ်လို့ရပါတယ်။ touchscreen အဆင်မပြေသေး။ </p><br><br>
<h3>linuxfb အတွက် </h3>
<p> waveshare lcd 3.5 အတွက် config.txt မှာ  တို့ကိုရေးပါ။ <br>
hdmi_force_hotplug=1 <br>
hdmi_cvt=480 320 60<br>
hdmi_group=2 <br>
hdmi_mode=87 <br>
disable_overscan=1 <br>
dtparam=spi=on<br>
dtoverlay=waveshare35a<br>
      </p>
      <p> /etc/profile.d/qt5-env.sh ထဲမှာတော့ အောက်ပါအတိုင်းရေးပါ။ <br>
export PATH=${PATH}:/usr/bin/qt5<br>
export QT_QPA_PLATFORM=eglfs<br>
export QT_QPA_EVDEV_TOUCHSCREEN_PARAMETERS=/dev/input/touchscreen0:rotate=90<br>
export QT_QPA_FB_TSLIB=1<br>
export TSLIB_FBDEVICE=/dev/fb1<br>
export TSLIB_TSDEVICE=/dev/input/touchscreen0<br>
</p>
<p> /etc/profile ထဲမှာတော့ QT_QPA_PLATFORM=eglfs ထည့်ပေးပါ။</p><br>
<p> Pi ရဲ့ GPU က /dev/fb1 မှာ attach လုပ်ထားတဲ့ SPI ဆီကို output မပို့ပေးနိုင်ပါဘူး။ GPU က HDMI ဖြစ်တဲ့ /dev/fb0 ကိုပဲသိပါတယ်။ အဲ့တော့ fb0 က output ကို fb1 ဆီပို့ပေးမယ်။ အဲ့လိုလုပ်ဖို့ raspi2fb ကို image မှာ သွင်းပြီးသားပဲ။ သူ့ကို enable လုပ်ပေးယုံပဲ။ link တော့ သွားထိုးပေးရမယ်။ <br>
  $ cd /etc/rc5.d <br>
  $ ln -sf ../init.d/raspi2fb S90raspi2fb <br>
  $ /etc/init.d/raspi2fb start <br>
</p>
<p> သူများပြောတာတော့ elgfs က touch သိပ်မကောင်းဘူးတဲ့ ။ linuxfb  မှာတော့ အခြေအနေကောင်းသတဲ့။ သိပ်မယုံနဲ့ စမ်းကြည့်ပြီးမှာသာယုံ </p>



