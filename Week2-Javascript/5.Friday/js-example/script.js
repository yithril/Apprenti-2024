// List of country objects with name, color, and flag URL
const countries = [
    {
        name: 'France',
        color: '#0055A4',
        flag: 'https://flagcdn.com/w320/fr.png'
    },
    {
        name: 'Germany',
        color: '#FFCC00',
        flag: 'https://flagcdn.com/w320/de.png'
    },
    {
        name: 'Brazil',
        color: '#009C3B',
        flag: 'https://flagcdn.com/w320/br.png'
    },
    {
        name: 'Japan',
        color: '#BC002D',
        flag: 'https://flagcdn.com/w320/jp.png'
    },
    {
        name: 'South Africa',
        color: '#007749',
        flag: 'https://flagcdn.com/w320/za.png'
    }
];

// Populate the dropdown with country names
const dropdown = document.getElementById('countryDropdown');
countries.forEach(country => {
    let option = document.createElement('option');
    option.value = country.name;
    option.textContent = country.name;
    dropdown.appendChild(option);
});

// Function to change the background color and flag
function changeCountry() {
    const selectedCountryName = dropdown.value;
    const selectedCountry = countries.find(country => country.name === selectedCountryName);

    if (selectedCountry) {
        // Change background color
        document.body.style.backgroundColor = selectedCountry.color;

        // Display the country flag
        const flagImg = document.getElementById('country-flag');
        flagImg.src = selectedCountry.flag;
        flagImg.style.display = 'block';
    }
}
