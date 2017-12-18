# karamba
A collection of useful Kotlin extension for Android

![karamba](https://github.com/matteocrippa/karamba/blob/master/.github/karamba.png?raw=true)

# Install

Add to **gradle** in _allprojects_

```
maven { url 'https://jitpack.io' }
```

then add this

```
compile 'com.github.matteocrippa:karamba:0.0.2'
```

# Usage
`Karamba` provides you a list of different and useful extensions for your project, here the list organized by the type extended.


## Bitmap
- `base64()`, produces a base64 representation of the current bitmap 
- `resize(height, width)`, resize the current bitmap to new format

## Boolean
- `toggle()`, handle the bool as a toogle changing the value to opposite one, then the new value is returned (not yet possible to change this)
- `random()`, returns a random boolean value, then the new value is returned (not yet possible to change this)

## Date
- `convertTo(format)`, converts current date to a custom format provided as argument (eg. `dd-MM-yy HH:mm`)
- `toCalendar()`, converts current date to `Calendar`
- `isFuture()`, returns true if date is in the future
- `isPast()`, returns true if date is in the past

## Double
- `localCurrency(currency)`, converts current double to the currency format passed as argument (eg. `EUR`)
- `celsiusToFahrenheit`, converts current double to fahrenheit
- `fahrenheitToCelsius`, converts current double to celsius

## Drawable
- `toBitmap()`, converts the current drawable in `Bitmap`

## Int
- `readableDistanceFromMeters()`, converts an int amount of meters in a readable meter, kilometers distance
- `commaSeparatedId()`, converts an array of int, in a string of comma separated items
- `random()`, provides a random number in the range provided (eg. `(0..10).random()`)

## String
- `isValidEmail()`, returns if current string is a valid email
- `isUrl()`, returns if current string is a valid url
- `isNumeric()`, returns if current string contains a number
- `isPhoneNumber()`, returns if current string contains a phone number
- `random(lenght)`, returns a random string of provided length
- `toBitmap()`, convert current base64 string into Bitmap
- `ellipsize(chars)`, ellipsizes the current string, truncating at defined amount of characters
- `toDate(format)`, converts current string in a `Date` object using the provided format
- `plainText()`, removes all html formatting from current string

## View
- `toBitmap()`, converts current view into `Bitmap`


#### Credits

Icon is taken by free emojii set by [Vincent Le Moign](https://dribbble.com/webalys)