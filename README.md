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
compile 'com.github.matteocrippa:karamba:0.0.1'
```

# Usage
`Karamba` provides you a list of different and useful extensions for your project, here the list organized by the type extended.


## Bitmap
- `base64()`, produces a base64 representation of the current bitmap 
- `resize(height, width)`, resize the current bitmap to new format


## Date
- `convertTo(format)`, converts current date to a custom format provided as argument (eg. `dd-MM-yy HH:mm`)
- `toCalendar()`, converts current date to `Calendar`

## Double
- `localCurrency(currency)`, converts current double to the currency format passed as argument (eg. `EUR`)

## Drawable
- `toBitmap()`, converts the current drawable in `Bitmap`

## Int
- `readableDistanceFromMeters()`, converts an int amount of meters in a readable meter, kilometers distance
- `commaSeparatedId()`, converts an array of int, in a string of comma separated items

## String
- `isValidEmail()`, returns if current string is a valid email
- `isUrl()`, returns if current string is a valid url
- `toBitmap()`, convert current base64 string into Bitmap
- `ellipsize(chars)`, ellipsizes the current string, truncating at defined amount of characters
- `toDate(format)`, converts current string in a `Date` object using the provided format
- `plainText()`, removes all html formatting from current string

## View
- `toBitmap()`, converts current view into `Bitmap`


#### Credits

Icon is taken by free emojii set by [Vincent Le Moign](https://dribbble.com/webalys)