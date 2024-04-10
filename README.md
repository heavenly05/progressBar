# progressBar
Progress bar i accidentally made in java. had no idea that java already had something called a JProgress bar, but mine has much more flexibility i think.

to use the progress bar you have to instantiate it as a variable

Ivb test = new Ivb()

you also have to provide parameters for the method as i only overloaded the constuctor once. they are simple though

Ivb test = new Ivb(x, y, width, height, cells/columns, frame/panel, borderThickness, showCellLines);

x: hrorizontal position of the progress bar
y:vertical position of the progress bar
width: width of the progress bar
height: height of the progress bar

cells: divides this number by the width of the inner panel to create cells or blocks. hard to explain but the less cells the more blocks and the more cells the more detailed the progress bar will be

frame/panel: this will automatically add the progress bar to your container withing the constructor so you dont have to add it all need be is instansiate it.

borderThickness: by default i made a border around the progressBar i dont recommend you try to use 0 because i dont know what will happen. the border thickness also determins the position and dimensions of the innerPanel

showCellLines: i used the paint method of the panel to paint lines on the progress bar. it evenly spaces it out so having too many cells will make it look ugly

by default the color of the panel is green i dont know if ill implement a feature to make it so you can edit it but well see.

i made 2 methods to make the progress bars interactive:

subtractFromBar(int takeAway)

addToBar(int giveAway)

they are public methods that dont return a value. this is the main reason you have to instansiate a object of the Ivb so you can you the methods on bars

the subtractFromBar method subtracts cells from the width of the inner panel making the progressBars line move. you can not enter a negative value as that will automatically be changed to 0.

the addToBar method adds cells back to the innerPanel, if it ever goes above the maximum amount of cells which you set in the constructor, then it will just set itself back to the max.

thats about it. please provide feedback.
