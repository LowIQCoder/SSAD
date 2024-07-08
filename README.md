<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a id="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![MIT License][license-shield]][license-url]
[![Issues][issues-shield]][issues-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://gitlab.pg.innopolis.university/team20/llm-rosalind">
    <img src="images/logo.jfif" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">LLM Rosalind</h3>

  <p align="center">
    New way of education!
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

![LLM Rosalind Screen Shot][product_screenshot]

LLM Rosalind is unique solution for studing and creating new courses. 

Here's why:
* Auto generations of courses from sources with use of LLM
* Graph representation of tasks
* Intuitive and beautiful interface

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

* NextJS
* FastAPI
* Postgres


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

## Run API
Get reposetory
```sh
git clone https://gitlab.pg.innopolis.university/team20/llm-rosalind.git -brabch feature_refactor_backend
```
Setup envoirement
```sh
pip install -r requirements.txt
```
Setup the .env file
```
# For database
POSTGRES_DB=someDB
POSTGRES_USER=someUser
POSTGRES_PASSWORD=somePW
POSTGRES_HOST=0.0.0.0
POSTGRES_PORT=9999
# For static files
STATIC_FILES_UPLOAD_PATH=\path\to\folder
STATIC_FILES_DOWNLOAD_PATH=\path\to\folder
```
Run API
```sh
python -m src.backend.api
```
## Run frontend
Get reposetory
```sh
git clone https://gitlab.pg.innopolis.university/team20/llm-rosalind.git -brabch main-page
```
Setup envoirement
```sh
npm install
```
Run frontend
```sh
npm run dev
```


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ROADMAP -->
## Roadmap

Oleg, vstav' suda kartinku is svoiei presentacii

See the [open issues](https://gitlab.pg.innopolis.university/team20/llm-rosalind/-/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Marsel Berheev - m.berheev@innopolis.university

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* [FastAPI](https://fastapi.tiangolo.com)
* [Best Chanel](https://www.youtube.com/watch?v=xvFZjo5PgG0)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- MARKDOWN LINKS & IMAGES -->
[license-url]: LICENSE.md
[contributors-url]: https://gitlab.pg.innopolis.university/team20/llm-rosalind/-/graphs/feature_refactor_backend?ref_type=heads
[product_screenshot]: images/llmrosalind.png
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
